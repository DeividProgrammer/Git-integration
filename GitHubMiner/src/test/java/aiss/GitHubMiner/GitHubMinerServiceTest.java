package aiss.GitHubMiner;


import aiss.GitHubMiner.models.comment.CommentGet;
import aiss.GitHubMiner.models.commit.CommitGet;
import aiss.GitHubMiner.models.issue.IssueGet;
import aiss.GitHubMiner.models.postGitMiner.Project;
import aiss.GitHubMiner.models.project.ProjectsGet;
import aiss.GitHubMiner.service.GitHubMinerService;
import aiss.GitHubMiner.service.parseToGitMiner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class GitHubMinerServiceTest {

    @Autowired
    GitHubMinerService service;

    @Autowired
    parseToGitMiner parsers;

    @Test
    @DisplayName("Get projects")
    void findAllProjects(){
        ProjectsGet projects = service.getProject("jgrapht","jgrapht");
        assertTrue(projects!=null, "The list of projects is empty!");
        System.out.println(projects);
    }

    @Test
    @DisplayName("Get all commits")
    void findAllCommits(){
        List<CommitGet> commits = service.getCommits("jgrapht", "jgrapht", 10);
        assertTrue(!commits.isEmpty(), "The list of commits is empty!");
        System.out.println(commits);

    }

    @Test
    @DisplayName("Get issues")
    void getIssues() {
        List<IssueGet> serviceIssues = service.getIssues("spring-projects", "spring-framework",10,3);
        assertTrue(!serviceIssues.isEmpty(), "This projects has no issues yet.");
        for(IssueGet issue: serviceIssues){
            System.out.println(issue);
        }
    }

    @Test
    @DisplayName("Get comments from an issue")
    void getCommentsFromAnIssue() {
        List<CommentGet> serviceComment = service.getComments("spring-projects", "spring-framework", 2);
        assertTrue(!serviceComment.isEmpty(), "There are no comments for this issue.");
        for(CommentGet comment: serviceComment){
            System.out.println(comment);
        }
    }

    @Test
    @DisplayName("parsers")
    void parsear(){
        ProjectsGet projects = service.getProject("spring-projects","spring-framework");
        List<CommitGet> commits = service.getCommits("spring-projects", "spring-framework",10,2);
        List<IssueGet> serviceIssues = service.getIssues("spring-projects", "spring-framework",10);
        Project p  = parsers.parseToGitMiner(projects,commits,serviceIssues);
        assertTrue(p!=null, "It is not possible to parse to project class.");
        System.out.println(p);
    }
}
