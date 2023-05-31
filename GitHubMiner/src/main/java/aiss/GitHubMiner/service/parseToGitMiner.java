package aiss.GitHubMiner.service;

import aiss.GitHubMiner.models.comment.CommentGet;
import aiss.GitHubMiner.models.comment.UserOfComment;
import aiss.GitHubMiner.models.commit.CommitGet;
import aiss.GitHubMiner.models.issue.IssueGet;
import aiss.GitHubMiner.models.issue.Label;
import aiss.GitHubMiner.models.issue.UserOfIssue;
import aiss.GitHubMiner.models.postGitMiner.*;
import aiss.GitHubMiner.models.project.ProjectsGet;
import aiss.GitHubMiner.models.user.UserGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class parseToGitMiner {

    @Autowired
    RestTemplate restTemplate;
    @Value("${githubminer.token}")
    private String token;



    public Project parseToGitMiner(ProjectsGet projectInput, List<CommitGet> commitInput,
                           List<IssueGet> issueInput){
        return parseToProject(projectInput, commitInput, issueInput);
    }

    private Project parseToProject(ProjectsGet projectInput, List<CommitGet> commitInput, List<IssueGet> issueInput) {
        List<Commit> commitPost = parseToListCommit(commitInput);
        List<Issue> issuePost = parseToListIssue(issueInput);

        return new Project(projectInput.getId().toString(), projectInput.getName(), projectInput.getHtml_url(),
                commitPost, issuePost);
    }

    private List<Commit> parseToListCommit(List<CommitGet> commitInput) {
        return commitInput.stream().map(x->parseaACommit(x)).toList();
    }

    private List<Issue> parseToListIssue(List<IssueGet> issueInput) {
        return issueInput.stream().map(x->parseToIssue(x)).toList();
    }

    private Issue parseToIssue(IssueGet issue) {
        return new Issue(issue.getId().toString(),
                issue.getRefId().toString(),
                issue.getTitle(),
                issue.getDescription(),
                issue.getState(),
                issue.getCreatedAt(),
                issue.getUpdatedAt(),
                issue.getClosedAt(),
                getNameLabelsForIssue(issue),
                getUserFromClassUserOfIssue(issue.getUser()),
                getUserFromClassUserOfIssue(issue.getAssignee()),
                issue.getReactions().getUpvotes(),
                issue.getReactions().getDownvotes(),
                issue.getWebUrl(),
                getCommentsForIssue(issue));
    }

    private Commit parseaACommit(CommitGet commitInput){
        aiss.GitHubMiner.models.commit.Commit commitData = commitInput.getCommit();
        return new Commit(
                commitInput.getSha(),
                // El sha viene del hash, y es único por commit. Por lo que nos puede servir como id del commit.
                getTitleOfCommit(commitInput),
                commitData.getMessage(),
                commitData.getAuthor().getName(),
                commitData.getAuthor().getEmail(),
                commitData.getAuthor().getEmail(),
                commitData.getCommitter().getName(),
                commitData.getCommitter().getEmail(),
                commitData.getCommitter().getDate(),
                commitInput.getHtml_url());
    }



    private List<String> getNameLabelsForIssue(IssueGet issueGet){
        return issueGet.getLabels().stream().map(Label::getName).toList();
    }

    // Necesario hacerlo así debido a que en UserOfIssue no está la propiedad name,
    // por lo que hay que buscar el usuario para obtenerlo.
    private User getUserFromClassUserOfIssue(UserOfIssue userOfIssue){
        User res=null;
        if(userOfIssue!=null){
        String baseUri = "https://api.github.com/users/"+userOfIssue.getUsername();
        UserGet userGet = restTemplate.exchange(baseUri, HttpMethod.GET,
                getHeaderToken(), UserGet.class).getBody();
        res =  parseToUser(userGet);

        }
        return res;
    }

    private List<Comment> getCommentsForIssue(IssueGet issueGet){
        CommentGet[] comments = restTemplate.exchange(issueGet.getCommentsUrl(),HttpMethod.GET,
                getHeaderToken(), CommentGet[].class).getBody();
        return Arrays.stream(comments).map(x-> parseToComment(x)).toList();
    }

    private String getTitleOfCommit(CommitGet commit){
        String[] message = commit.getCommit().getMessage().split("\n\n");
        return message[0]; // El título está en el mensaje, y viene antes del \n\n
    }

    private List<Commit> getCommitsForProject(ProjectsGet projectsGet){
        Commit[] commits = restTemplate.exchange(projectsGet.getCommits_url(),HttpMethod.GET,
                getHeaderToken(), Commit[].class).getBody();
        return Arrays.stream(commits).toList();
    }

    private List<Issue> getIssuesForProject(ProjectsGet projectsGet){
        Issue[] issues = restTemplate.exchange(projectsGet.getCommits_url(),
                HttpMethod.GET,getHeaderToken(), Issue[].class).getBody();
        return Arrays.stream(issues).toList();
    }

    private Comment parseToComment(CommentGet commentInput) {
        return new Comment(commentInput.getId().toString(),commentInput.getBody(),
                getUserFromUserOfComment(commentInput.getUser()),
                commentInput.getCreatedAt(),commentInput.getUpdatedAt());
    }
    private User parseToUser(UserGet user) {
        return new User(user.getId().toString(),
                user.getUsername(),
                user.getName(),
                user.getAvatarUrl(),
                user.getHtmlUrl());
    }

    private User getUserFromUserOfComment(UserOfComment userOfComment){
        String baseUri = "https://api.github.com/users/";
        UserGet user = restTemplate.exchange(baseUri+userOfComment.getUsername(),HttpMethod.GET,
                getHeaderToken(), UserGet.class).getBody();
        return parseToUser(user);
    }

    public <E> HttpEntity<E> getHeaderToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        HttpEntity<E> entity = new HttpEntity<>(null, headers);
        return entity;
    }
}
