package aiss.GitHubMiner.service;

import aiss.GitHubMiner.models.comment.CommentGet;
import aiss.GitHubMiner.models.commit.CommitGet;
import aiss.GitHubMiner.models.issue.IssueGet;
import aiss.GitHubMiner.models.postGitMiner.Project;
import aiss.GitHubMiner.models.project.ProjectsGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static aiss.GitHubMiner.util.Pagination.getNextPageUrl;

@Service
public class GitHubMinerService {

    //Hay que poner con paginacion el get o con o sin token?

    @Autowired
    RestTemplate restTemplate;

    @Value("${githubminer.baseuri}")
    public String baseUri;

    @Value("${githubminer.token}")
    private String token;

    @Value("${gitminer.baseUri}")
    public String gitMinerUri;

    public ProjectsGet getProject(String owner, String repo){
        String uriProject = String.format("%s/%s/%s", baseUri,owner,repo);
        ResponseEntity<ProjectsGet> projects = restTemplate.exchange(uriProject, HttpMethod.GET,
                            getHeaderToken(), ProjectsGet.class);
        return projects.getBody();
    }

    public Project postProject(Project project){
        ResponseEntity<Project> response = restTemplate.postForEntity(gitMinerUri+"/projects", project, Project.class);
        return response.getBody();
    }
    public List<CommitGet> getCommits(String owner, String repo, Integer sinceDays){
        ResponseEntity<CommitGet[]> commits = getResponseEntityCommitWithToken(owner, repo, sinceDays);
        return Arrays.stream(commits.getBody()).toList();
    }

    public List<IssueGet> getIssues(String owner, String repository, Integer sinceDays){
        ResponseEntity<IssueGet[]> issues = getResponseEntityIssueWithToken(owner,repository,sinceDays);
        return Arrays.stream(issues.getBody()).toList();
    }

    public List<CommentGet> getComments(String owner, String repository, Integer issue){
        ResponseEntity<CommentGet[]> comments = getResponseEntityCommentsWithToken(owner,repository,issue);
        return Arrays.stream(comments.getBody()).toList();
    }

    public <E> HttpEntity<E> getHeaderToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        HttpEntity<E> entity = new HttpEntity<>(null, headers);
        return entity;
    }

    // ----------------- --------- PAGINATION --------------------------------------
    public List<CommitGet> getCommits(String owner, String repo, int sinceDays, int maxPages){
        List<CommitGet> commits = new ArrayList<>();

        LocalDate since = LocalDate.now().minusDays(sinceDays);
        String uriCommit = String.format("%s/%s/%s/commits?since=%s", baseUri,owner,repo,since.toString());

        ResponseEntity<CommitGet[]> response = getResponseEntityCommitWithToken(owner,repo,sinceDays);
        List<CommitGet> pageCommits = Arrays.stream(response.getBody()).toList();
        commits.addAll(pageCommits);

        String nextPageURL = getNextPageUrl(response.getHeaders());
        int page = 2;
        while (nextPageURL != null && page <= maxPages) {
            response = getResponseEntityCommitWithToken(owner, repo,sinceDays);
            commits.addAll(pageCommits);

            nextPageURL = getNextPageUrl(response.getHeaders());
            page++;
        }
        return commits;
    }

    public List<IssueGet> getIssues(String owner, String repo, Integer sinceDays, Integer maxPages){
        List<IssueGet> issues = new ArrayList<>();

        LocalDate since = LocalDate.now().minusDays(sinceDays);
        String uriCommit = String.format("%s/%s/%s/issue?since=%s", baseUri,owner,repo,since.toString());

        ResponseEntity<IssueGet[]> response = getResponseEntityIssueWithToken(owner,repo,sinceDays);
        List<IssueGet> pageCommits = Arrays.stream(response.getBody()).toList();
        issues.addAll(pageCommits);

        String nextPageURL = getNextPageUrl(response.getHeaders());
        int page = 2;
        while (nextPageURL != null && page <= maxPages) {
            response = getResponseEntityIssueWithToken(owner, repo,sinceDays);
            issues.addAll(pageCommits);

            nextPageURL = getNextPageUrl(response.getHeaders());
            page++;
        }
        return issues;

    }

    public List<CommentGet> getComments(String owner, String repo,Integer issue, Integer maxPages){
        List<CommentGet> comments = new ArrayList<>();


        ResponseEntity<CommentGet[]> response = getResponseEntityCommentsWithToken(owner,repo,issue);
        List<CommentGet> pageCommits = Arrays.stream(response.getBody()).toList();
        comments.addAll(pageCommits);

        String nextPageURL = getNextPageUrl(response.getHeaders());
        int page = 2;
        while (nextPageURL != null && page <= maxPages) {
            response = getResponseEntityCommentsWithToken(owner, repo,issue);
            comments.addAll(pageCommits);

            nextPageURL = getNextPageUrl(response.getHeaders());
            page++;
        }
        return comments;

    }

    private ResponseEntity<CommitGet[]> getResponseEntityCommitWithToken(String owner, String repo, Integer sinceDays){
        String uriCommit = String.format("%s/%s/%s/commits", baseUri,owner,repo);
        if(sinceDays!=null){
            LocalDate since = LocalDate.now().minusDays(sinceDays);
            uriCommit = String.format("%s/%s/%s/commits?since=%s", baseUri,owner,repo,since.toString());
        }
        return restTemplate.exchange(uriCommit, HttpMethod.GET, getHeaderToken(), CommitGet[].class);
    }

    private ResponseEntity<IssueGet[]> getResponseEntityIssueWithToken(String owner, String repo, Integer sinceDays) {
        String uriIssues = String.format("%s/%s/%s/issues",  baseUri, owner, repo);
        if(sinceDays!=null){
            LocalDate since = LocalDate.now().minusDays(sinceDays);
            uriIssues = String.format("%s/%s/%s/issues?since=?%s",  baseUri, owner, repo, since);
        }
        return restTemplate.exchange(uriIssues, HttpMethod.GET, getHeaderToken(), IssueGet[].class);
    }

    private ResponseEntity<CommentGet[]> getResponseEntityCommentsWithToken(String owner, String repository, Integer issue) {
        String uriComments = String.format("%s/%s/%s/issues/%d/comments", baseUri, owner, repository, issue);
        return restTemplate.exchange(uriComments, HttpMethod.GET,
                getHeaderToken(), CommentGet[].class);
    }



}
