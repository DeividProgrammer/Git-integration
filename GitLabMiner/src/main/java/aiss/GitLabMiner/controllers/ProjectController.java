package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.modelsGitLab.*;
import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.services.ServiceGitLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/gitlab")
public class ProjectController{

    @Autowired
    ServiceGitLab ServiceGitLab;

    @Autowired
    RestTemplate restTemplate;

    // GET http://localhost:8081/gitlab/{id}[?since=5&updatedAfter=30&maxPages=3]
    @GetMapping("/{id}")
    public ProjectGitLab findOneProject(@PathVariable String id,
                                             @RequestParam(required = false, name = "sinceCommits", defaultValue = "2") Integer since,
                                             @RequestParam(required = false, name = "sinceIssues", defaultValue = "20") Integer updatedAfter,
                                             @RequestParam(required = false, name = "max_pages", defaultValue = "2") Integer maxPages){
        Project project = ServiceGitLab.getProjectById(id).getBody();
        String projectId = project.getId().toString();
        String projectName = project.getName();
        String project_webUrl = project.getWebUrl();
        List<CommitGitLab> commits = ServiceGitLab.groupAllCommits(id,since,maxPages).stream().map(x->formatCommit(x)).toList();
        List<IssueGitLab> issues = ServiceGitLab.groupAllIssues(id, updatedAfter, maxPages).stream().map(x->formatIssue(x,id,maxPages)).toList();


        return new ProjectGitLab(projectId,projectName,project_webUrl,commits,issues);
    }

    private CommitGitLab formatCommit(Commit commit){
        return new CommitGitLab(commit.getId(),commit.getTitle(),commit.getMessage(),
                commit.getAuthorName(),commit.getAuthorEmail(),commit.getAuthoredDate(),
                commit.getCommitterName(),commit.getCommitterEmail(),commit.getCommittedDate(),commit.getWebUrl());

    }

    private IssueGitLab formatIssue(Issue issue, String id, Integer maxPages){
        String issueId = issue.getId().toString();
        String ref_id = issue.getIid().toString();
        String title = issue.getTitle();
        String description = issue.getDescription();
        String state = issue.getState();
        String created_at = issue.getCreatedAt();
        String updated_at = issue.getUpdatedAt();
        String closed_at = issue.getClosedAt();
        List<String> labels = issue.getLabels();
        UserGitLab author = new UserGitLab(issue.getAuthor().getId().toString(), issue.getAuthor().getUsername(),issue.getAuthor().getName(),issue.getAuthor().getAvatarUrl(),issue.getAuthor().getWebUrl());

        UserGitLab assignee = issue.getAssignee()==null?null:new UserGitLab(issue.getAssignee().getId().toString(), issue.getAssignee().getUsername(), issue.getAssignee().getName(), issue.getAssignee().getAvatarUrl(), issue.getAssignee().getWebUrl());
        //GitLabMinerUser assignee = null;
        Integer upvotes = issue.getUpvotes();
        Integer downvotes = issue.getDownvotes();
        String web_url = issue.getWebUrl();
        List<CommentGitLab> comments= ServiceGitLab.groupIssueComments(id,issue.getIid().toString(),maxPages).stream().map(x->formatComment(x)).toList();


        return new IssueGitLab(issueId, ref_id, title, description, state, created_at, updated_at, closed_at, labels,
                author,assignee,upvotes,downvotes,web_url,comments);
    }

    private CommentGitLab formatComment(Comment comment){
        String id = comment.getId().toString();
        String body = comment.getBody();
        UserGitLab author = new UserGitLab(comment.getAuthor().getId().toString(), comment.getAuthor().getUsername(),comment.getAuthor().getName(),comment.getAuthor().getAvatarUrl(),comment.getAuthor().getWebUrl());
        String created_at = comment.getCreatedAt();
        String updated_at = comment.getUpdatedAt();
        return new CommentGitLab(id, body, author, created_at, updated_at);
    }


    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectGitLab SendProject(@PathVariable String id,
                                          @RequestParam(required = false,name="sinceCommits", defaultValue = "2") Integer since,
                                          @RequestParam(required = false, name = "sinceIssues", defaultValue = "20") Integer updatedAfter,
                                          @RequestParam(required = false, name = "max_pages", defaultValue = "2") Integer maxPages){

        Project project = ServiceGitLab.getProjectById(id).getBody();
        String projectId = project.getId().toString();
        String projectName = project.getName();
        String project_webUrl = project.getWebUrl();
        List<CommitGitLab> commits = ServiceGitLab.groupAllCommits(id,since,maxPages).stream().map(x->formatCommit(x)).toList();
        List<IssueGitLab> issues = ServiceGitLab.groupAllIssues(id, updatedAfter, maxPages).stream().map(x->formatIssue(x,id,maxPages)).toList();

        ProjectGitLab formatProject = new ProjectGitLab(projectId,projectName,project_webUrl,commits,issues);


        ProjectGitLab sentProject = restTemplate.postForObject("http://localhost:8080/gitminer/projects", formatProject,ProjectGitLab.class);

        return sentProject;

    }

}