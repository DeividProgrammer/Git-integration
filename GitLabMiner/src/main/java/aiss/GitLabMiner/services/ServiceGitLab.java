package aiss.GitLabMiner.services;

import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.utils.UtilsGitLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceGitLab {

    @Autowired
    RestTemplate restTemplate;

    @Value("${gitlabminer.token}")
    private String token;

    public ResponseEntity<Project> getProjectById(String id){
        String uri = "https://gitlab.com/api/v4/projects/"+id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("PRIVATE-TOKEN", token);

        HttpEntity<Project> request = new HttpEntity<>(null,headers);

        return restTemplate.exchange(uri, HttpMethod.GET, request
                , Project.class);
    }

    private <E> ResponseEntity<E[]> getResponseEntity(String uri, Class<E[]> clase) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        HttpEntity<E[]> request = new HttpEntity<>(null,headers);

        return restTemplate.exchange(uri,
                HttpMethod.GET,
                request,
                clase);
    }

    public ResponseEntity<Issue[]> getAllIssues(String id){
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues";

        return getResponseEntity(uri,Issue[].class);
    }

    public List<Issue> groupAllIssues(String id, Integer updated_after, Integer maxPages) throws HttpClientErrorException {
        List<Issue> issues = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues";

        if (updated_after != null) {
            uri += "/?updated_after=" + LocalDateTime.now().minusDays(updated_after);
        } else {
            uri += "/?updated_after=" + LocalDateTime.now().minusDays(20);
        }

        ResponseEntity<Issue[]> response = getResponseEntity(uri,Issue[].class);
        List<Issue> pageIssues = Arrays.stream(response.getBody()).toList();
        issues.addAll(pageIssues);

        //2...n
        String nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while (nextPageURL != null && page <= defaultPages) {
            response = getResponseEntity(nextPageURL,Issue[].class);
            pageIssues = Arrays.stream(response.getBody()).toList();
            issues.addAll(pageIssues);
            nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
            page++;
        }
        return issues;
    }

    public ResponseEntity<Comment[]> getIssueComments(String id, String issue_iid){

        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues/" + issue_iid + "/notes";

        return getResponseEntity(uri,Comment[].class);
    }

    public List<Comment> groupIssueComments(String id, String issue_iid, Integer maxPages) throws HttpClientErrorException{
        List<Comment> comments = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues/" + issue_iid + "/notes";

        ResponseEntity<Comment[]> response = getResponseEntity(uri, Comment[].class);
        List<Comment> pageComments = Arrays.stream(response.getBody()).toList();
        comments.addAll(pageComments);

        //2...n
        String nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while(nextPageURL != null && page <= defaultPages){
            response = getResponseEntity(nextPageURL,Comment[].class);
            pageComments = Arrays.stream(response.getBody()).toList();
            comments.addAll(pageComments);

            nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
            page++;
        }

        return comments;
    }

    public ResponseEntity<Commit[]> getAllCommits(String id) {
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/repository/commits";

        return getResponseEntity(uri,Commit[].class);
    }

    public List<Commit> groupAllCommits(String id, Integer updated_after, Integer maxPages) throws HttpClientErrorException {
        List<Commit> issues = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/repository/commits";

        if (updated_after != null) {
            uri += "/?since=" + LocalDateTime.now().minusDays(updated_after);
        } else {
            uri += "/?since=" + LocalDateTime.now().minusDays(20);
        }

        ResponseEntity<Commit[]> response = getResponseEntity(uri,Commit[].class);
        List<Commit> pageIssues = Arrays.stream(response.getBody()).toList();
        issues.addAll(pageIssues);

        //2...n
        String nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while (nextPageURL != null && page <= defaultPages) {
            response = getResponseEntity(nextPageURL,Commit[].class);
            pageIssues = Arrays.stream(response.getBody()).toList();
            issues.addAll(pageIssues);
            nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
            page++;
        }
        return issues;
    }
    public List<Commit> groupAllCommits3(String id, Integer sinceDays, Integer maxPages) {
        List<Commit> commits = new ArrayList<>();
        String baseUri = "https://gitlab.com/api/v4/projects";

        LocalDate since = LocalDate.now().minusDays(sinceDays);
        String uriCommit = String.format("%s/%s/repository/commits?since=%s", baseUri,id,since.toString());

        ResponseEntity<Commit[]> response = getResponseEntityCommitWithToken(baseUri,id,sinceDays);
        List<Commit> pageCommits = Arrays.stream(response.getBody()).toList();
        commits.addAll(pageCommits);

        String nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
        int page = 2;
        while (nextPageURL != null && page <= maxPages) {
            response = getResponseEntityCommitWithToken(baseUri,id,sinceDays);
            commits.addAll(pageCommits);

            nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
            page++;
        }
        return commits;
    }

    private ResponseEntity<Commit[]> getResponseEntityCommitWithToken(String baseUri, String id, Integer sinceDays){
        String uriCommit = String.format("%s/%s/repository/commits", baseUri, id);
        if(sinceDays!=null){
            LocalDate since = LocalDate.now().minusDays(sinceDays);
            uriCommit = String.format("%s/%s/repository/commits?since=%s", baseUri,id,since.toString());
        }
        return restTemplate.exchange(uriCommit, HttpMethod.GET, getHeaderToken(), Commit[].class);
    }

    public <T1> HttpEntity<T1> getHeaderToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        HttpEntity<T1> entity = new HttpEntity<>(null, headers);
        return entity;
    }

    public List<Commit> groupAllCommits2(String id, Integer since, Integer maxPages) throws HttpClientErrorException{
        List<Commit> commits = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/"+id+"/repository/commits";

        if (since != null) {
            uri += "?since=" + LocalDateTime.now().minusDays(since);
        } else {
            uri += "?since=" + LocalDateTime.now().minusDays(2);
        }

        ResponseEntity<Commit[]> response = getResponseEntity(uri, Commit[].class);
        List<Commit> pageCommits = Arrays.stream(response.getBody()).toList();
        commits.addAll(pageCommits);

        //2...n
        String nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while (nextPageURL != null && page <= defaultPages) {
            response = getResponseEntity(nextPageURL,Commit[].class);
            pageCommits = Arrays.stream(response.getBody()).toList();
            commits.addAll(pageCommits);

            nextPageURL = UtilsGitLab.getNextPageUrl(response.getHeaders());
            page++;

        }
        return commits;

    }

}
