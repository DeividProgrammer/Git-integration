package aiss.GitLabMiner.services;

import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.models.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceGitLabTest {
    @Autowired
    ServiceGitLab serviceGitLab;

    @Test
    void getProjectById() {
        ResponseEntity<Project> project = serviceGitLab.getProjectById("278964");
        assertTrue(project.getBody() != null, "the project is empty");
        System.out.println(project.getBody());
    }

    @Test
    void getAllIssues() {
        ResponseEntity<Issue[]> issues = serviceGitLab.getAllIssues("278964");
        assertTrue(issues.getBody() != null, "no issues have been found");
        System.out.println(Arrays.stream(issues.getBody()).toList());
    }

    @Test
    void groupAllIssues() {
        List<Issue> place = serviceGitLab.groupAllIssues("278964", 30, 3);
        assertTrue(place.size() != 0, "the list of issues is empty");
        System.out.println(place);
    }

    @Test
    void getIssueComments() {
        ResponseEntity<Comment[]> comments = serviceGitLab.getIssueComments("278964", "1111");
        assertTrue(comments.getBody() != null, "no comments were found");
        System.out.println(Arrays.stream(comments.getBody()).toList());
    }

    @Test
    void groupIssueComments() {
        List<Comment> place = serviceGitLab.groupIssueComments("278964", "1111", 3);
        assertTrue(place.size() != 0, "the list of comments is empty");
        System.out.println(place);
    }

    @Test
    void getAllCommits() {
        ResponseEntity<Commit[]> commits = serviceGitLab.getAllCommits("278964");
        assertTrue(commits.getBody() != null, "no commits have been found");
        System.out.println(Arrays.stream(commits.getBody()).toList());
    }

    @Test
    void groupAllCommits() {
        List<Commit> place = serviceGitLab.groupAllCommits("278964", null, 3);
        assertTrue(place.size() != 0, "the list of commits is empty");
        System.out.println(place);
    }
}