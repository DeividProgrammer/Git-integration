
package aiss.GitHubMiner.models.commit;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommitGet {

    @JsonProperty("sha")
    private String sha;
    @JsonProperty("node_id")
    private String node_id;
    @JsonProperty("commit")
    private Commit commit;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String html_url;
    @JsonProperty("comments_url")
    private String comments_url;
    @JsonProperty("author")
    private Author__1 author;
    @JsonProperty("committer")
    private Committer__1 committer;
    @JsonProperty("parents")
    private List<Parent> parents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    @JsonProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonProperty("node_id")
    public String getNode_id() {
        return node_id;
    }

    @JsonProperty("node_id")
    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    @JsonProperty("commit")
    public Commit getCommit() {
        return commit;
    }

    @JsonProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("html_url")
    public String getHtml_url() {
        return html_url;
    }

    @JsonProperty("html_url")
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    @JsonProperty("comments_url")
    public String getComments_url() {
        return comments_url;
    }

    @JsonProperty("comments_url")
    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    @JsonProperty("author")
    public Author__1 getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author__1 author) {
        this.author = author;
    }

    @JsonProperty("committer")
    public Committer__1 getCommitter() {
        return committer;
    }

    @JsonProperty("committer")
    public void setCommitter(Committer__1 committer) {
        this.committer = committer;
    }

    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitGet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sha");
        sb.append('=');
        sb.append(((this.sha == null)?"<null>":this.sha));
        sb.append(',');
        sb.append("node_id");
        sb.append('=');
        sb.append(((this.node_id == null)?"<null>":this.node_id));
        sb.append(',');
        sb.append("commit");
        sb.append('=');
        sb.append(((this.commit == null)?"<null>":this.commit));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("html_url");
        sb.append('=');
        sb.append(((this.html_url == null)?"<null>":this.html_url));
        sb.append(',');
        sb.append("comments_url");
        sb.append('=');
        sb.append(((this.comments_url == null)?"<null>":this.comments_url));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("committer");
        sb.append('=');
        sb.append(((this.committer == null)?"<null>":this.committer));
        sb.append(',');
        sb.append("parents");
        sb.append('=');
        sb.append(((this.parents == null)?"<null>":this.parents));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
