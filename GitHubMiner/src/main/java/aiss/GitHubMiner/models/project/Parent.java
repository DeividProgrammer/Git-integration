
package aiss.GitHubMiner.models.project;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Parent {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("node_id")
    private String node_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String full_name;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("owner")
    private Owner__1 owner;
    @JsonProperty("html_url")
    private String html_url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fork")
    private Boolean fork;
    @JsonProperty("url")
    private String url;
    @JsonProperty("forks_url")
    private String forks_url;
    @JsonProperty("keys_url")
    private String keys_url;
    @JsonProperty("collaborators_url")
    private String collaborators_url;
    @JsonProperty("teams_url")
    private String teams_url;
    @JsonProperty("hooks_url")
    private String hooks_url;
    @JsonProperty("issue_events_url")
    private String issue_events_url;
    @JsonProperty("events_url")
    private String events_url;
    @JsonProperty("assignees_url")
    private String assignees_url;
    @JsonProperty("branches_url")
    private String branches_url;
    @JsonProperty("tags_url")
    private String tags_url;
    @JsonProperty("blobs_url")
    private String blobs_url;
    @JsonProperty("git_tags_url")
    private String git_tags_url;
    @JsonProperty("git_refs_url")
    private String git_refs_url;
    @JsonProperty("trees_url")
    private String trees_url;
    @JsonProperty("statuses_url")
    private String statuses_url;
    @JsonProperty("languages_url")
    private String languages_url;
    @JsonProperty("stargazers_url")
    private String stargazers_url;
    @JsonProperty("contributors_url")
    private String contributors_url;
    @JsonProperty("subscribers_url")
    private String subscribers_url;
    @JsonProperty("subscription_url")
    private String subscription_url;
    @JsonProperty("commits_url")
    private String commits_url;
    @JsonProperty("git_commits_url")
    private String git_commits_url;
    @JsonProperty("comments_url")
    private String comments_url;
    @JsonProperty("issue_comment_url")
    private String issue_comment_url;
    @JsonProperty("contents_url")
    private String contents_url;
    @JsonProperty("compare_url")
    private String compare_url;
    @JsonProperty("merges_url")
    private String merges_url;
    @JsonProperty("archive_url")
    private String archive_url;
    @JsonProperty("downloads_url")
    private String downloads_url;
    @JsonProperty("issues_url")
    private String issues_url;
    @JsonProperty("pulls_url")
    private String pulls_url;
    @JsonProperty("milestones_url")
    private String milestones_url;
    @JsonProperty("notifications_url")
    private String notifications_url;
    @JsonProperty("labels_url")
    private String labels_url;
    @JsonProperty("releases_url")
    private String releases_url;
    @JsonProperty("deployments_url")
    private String deployments_url;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("updated_at")
    private String updated_at;
    @JsonProperty("pushed_at")
    private String pushed_at;
    @JsonProperty("git_url")
    private String git_url;
    @JsonProperty("ssh_url")
    private String ssh_url;
    @JsonProperty("clone_url")
    private String clone_url;
    @JsonProperty("svn_url")
    private String svn_url;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("stargazers_count")
    private Integer stargazers_count;
    @JsonProperty("watchers_count")
    private Integer watchers_count;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_issues")
    private Boolean has_issues;
    @JsonProperty("has_projects")
    private Boolean has_projects;
    @JsonProperty("has_downloads")
    private Boolean has_downloads;
    @JsonProperty("has_wiki")
    private Boolean has_wiki;
    @JsonProperty("has_pages")
    private Boolean has_pages;
    @JsonProperty("has_discussions")
    private Boolean has_discussions;
    @JsonProperty("forks_count")
    private Integer forks_count;
    @JsonProperty("mirror_url")
    private Object mirror_url;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("disabled")
    private Boolean disabled;
    @JsonProperty("open_issues_count")
    private Integer open_issues_count;
    @JsonProperty("license")
    private License__1 license;
    @JsonProperty("allow_forking")
    private Boolean allow_forking;
    @JsonProperty("is_template")
    private Boolean is_template;
    @JsonProperty("web_commit_signoff_required")
    private Boolean web_commit_signoff_required;
    @JsonProperty("topics")
    private List<Object> topics;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("forks")
    private Integer forks;
    @JsonProperty("open_issues")
    private Integer open_issues;
    @JsonProperty("watchers")
    private Integer watchers;
    @JsonProperty("default_branch")
    private String default_branch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("node_id")
    public String getNode_id() {
        return node_id;
    }

    @JsonProperty("node_id")
    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("full_name")
    public String getFull_name() {
        return full_name;
    }

    @JsonProperty("full_name")
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("owner")
    public Owner__1 getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner__1 owner) {
        this.owner = owner;
    }

    @JsonProperty("html_url")
    public String getHtml_url() {
        return html_url;
    }

    @JsonProperty("html_url")
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("forks_url")
    public String getForks_url() {
        return forks_url;
    }

    @JsonProperty("forks_url")
    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    @JsonProperty("keys_url")
    public String getKeys_url() {
        return keys_url;
    }

    @JsonProperty("keys_url")
    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    @JsonProperty("collaborators_url")
    public String getCollaborators_url() {
        return collaborators_url;
    }

    @JsonProperty("collaborators_url")
    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    @JsonProperty("teams_url")
    public String getTeams_url() {
        return teams_url;
    }

    @JsonProperty("teams_url")
    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    @JsonProperty("hooks_url")
    public String getHooks_url() {
        return hooks_url;
    }

    @JsonProperty("hooks_url")
    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    @JsonProperty("issue_events_url")
    public String getIssue_events_url() {
        return issue_events_url;
    }

    @JsonProperty("issue_events_url")
    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    @JsonProperty("events_url")
    public String getEvents_url() {
        return events_url;
    }

    @JsonProperty("events_url")
    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    @JsonProperty("assignees_url")
    public String getAssignees_url() {
        return assignees_url;
    }

    @JsonProperty("assignees_url")
    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    @JsonProperty("branches_url")
    public String getBranches_url() {
        return branches_url;
    }

    @JsonProperty("branches_url")
    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    @JsonProperty("tags_url")
    public String getTags_url() {
        return tags_url;
    }

    @JsonProperty("tags_url")
    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    @JsonProperty("blobs_url")
    public String getBlobs_url() {
        return blobs_url;
    }

    @JsonProperty("blobs_url")
    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    @JsonProperty("git_tags_url")
    public String getGit_tags_url() {
        return git_tags_url;
    }

    @JsonProperty("git_tags_url")
    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    @JsonProperty("git_refs_url")
    public String getGit_refs_url() {
        return git_refs_url;
    }

    @JsonProperty("git_refs_url")
    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    @JsonProperty("trees_url")
    public String getTrees_url() {
        return trees_url;
    }

    @JsonProperty("trees_url")
    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
    }

    @JsonProperty("statuses_url")
    public String getStatuses_url() {
        return statuses_url;
    }

    @JsonProperty("statuses_url")
    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    @JsonProperty("languages_url")
    public String getLanguages_url() {
        return languages_url;
    }

    @JsonProperty("languages_url")
    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    @JsonProperty("stargazers_url")
    public String getStargazers_url() {
        return stargazers_url;
    }

    @JsonProperty("stargazers_url")
    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    @JsonProperty("contributors_url")
    public String getContributors_url() {
        return contributors_url;
    }

    @JsonProperty("contributors_url")
    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    @JsonProperty("subscribers_url")
    public String getSubscribers_url() {
        return subscribers_url;
    }

    @JsonProperty("subscribers_url")
    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    @JsonProperty("subscription_url")
    public String getSubscription_url() {
        return subscription_url;
    }

    @JsonProperty("subscription_url")
    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    @JsonProperty("commits_url")
    public String getCommits_url() {
        return commits_url;
    }

    @JsonProperty("commits_url")
    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    @JsonProperty("git_commits_url")
    public String getGit_commits_url() {
        return git_commits_url;
    }

    @JsonProperty("git_commits_url")
    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
    }

    @JsonProperty("comments_url")
    public String getComments_url() {
        return comments_url;
    }

    @JsonProperty("comments_url")
    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    @JsonProperty("issue_comment_url")
    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    @JsonProperty("issue_comment_url")
    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    @JsonProperty("contents_url")
    public String getContents_url() {
        return contents_url;
    }

    @JsonProperty("contents_url")
    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    @JsonProperty("compare_url")
    public String getCompare_url() {
        return compare_url;
    }

    @JsonProperty("compare_url")
    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }

    @JsonProperty("merges_url")
    public String getMerges_url() {
        return merges_url;
    }

    @JsonProperty("merges_url")
    public void setMerges_url(String merges_url) {
        this.merges_url = merges_url;
    }

    @JsonProperty("archive_url")
    public String getArchive_url() {
        return archive_url;
    }

    @JsonProperty("archive_url")
    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    @JsonProperty("downloads_url")
    public String getDownloads_url() {
        return downloads_url;
    }

    @JsonProperty("downloads_url")
    public void setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
    }

    @JsonProperty("issues_url")
    public String getIssues_url() {
        return issues_url;
    }

    @JsonProperty("issues_url")
    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    @JsonProperty("pulls_url")
    public String getPulls_url() {
        return pulls_url;
    }

    @JsonProperty("pulls_url")
    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    @JsonProperty("milestones_url")
    public String getMilestones_url() {
        return milestones_url;
    }

    @JsonProperty("milestones_url")
    public void setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
    }

    @JsonProperty("notifications_url")
    public String getNotifications_url() {
        return notifications_url;
    }

    @JsonProperty("notifications_url")
    public void setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
    }

    @JsonProperty("labels_url")
    public String getLabels_url() {
        return labels_url;
    }

    @JsonProperty("labels_url")
    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    @JsonProperty("releases_url")
    public String getReleases_url() {
        return releases_url;
    }

    @JsonProperty("releases_url")
    public void setReleases_url(String releases_url) {
        this.releases_url = releases_url;
    }

    @JsonProperty("deployments_url")
    public String getDeployments_url() {
        return deployments_url;
    }

    @JsonProperty("deployments_url")
    public void setDeployments_url(String deployments_url) {
        this.deployments_url = deployments_url;
    }

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("updated_at")
    public String getUpdated_at() {
        return updated_at;
    }

    @JsonProperty("updated_at")
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @JsonProperty("pushed_at")
    public String getPushed_at() {
        return pushed_at;
    }

    @JsonProperty("pushed_at")
    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    @JsonProperty("git_url")
    public String getGit_url() {
        return git_url;
    }

    @JsonProperty("git_url")
    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    @JsonProperty("ssh_url")
    public String getSsh_url() {
        return ssh_url;
    }

    @JsonProperty("ssh_url")
    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    @JsonProperty("clone_url")
    public String getClone_url() {
        return clone_url;
    }

    @JsonProperty("clone_url")
    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    @JsonProperty("svn_url")
    public String getSvn_url() {
        return svn_url;
    }

    @JsonProperty("svn_url")
    public void setSvn_url(String svn_url) {
        this.svn_url = svn_url;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("stargazers_count")
    public Integer getStargazers_count() {
        return stargazers_count;
    }

    @JsonProperty("stargazers_count")
    public void setStargazers_count(Integer stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    @JsonProperty("watchers_count")
    public Integer getWatchers_count() {
        return watchers_count;
    }

    @JsonProperty("watchers_count")
    public void setWatchers_count(Integer watchers_count) {
        this.watchers_count = watchers_count;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("has_issues")
    public Boolean getHas_issues() {
        return has_issues;
    }

    @JsonProperty("has_issues")
    public void setHas_issues(Boolean has_issues) {
        this.has_issues = has_issues;
    }

    @JsonProperty("has_projects")
    public Boolean getHas_projects() {
        return has_projects;
    }

    @JsonProperty("has_projects")
    public void setHas_projects(Boolean has_projects) {
        this.has_projects = has_projects;
    }

    @JsonProperty("has_downloads")
    public Boolean getHas_downloads() {
        return has_downloads;
    }

    @JsonProperty("has_downloads")
    public void setHas_downloads(Boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    @JsonProperty("has_wiki")
    public Boolean getHas_wiki() {
        return has_wiki;
    }

    @JsonProperty("has_wiki")
    public void setHas_wiki(Boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    @JsonProperty("has_pages")
    public Boolean getHas_pages() {
        return has_pages;
    }

    @JsonProperty("has_pages")
    public void setHas_pages(Boolean has_pages) {
        this.has_pages = has_pages;
    }

    @JsonProperty("has_discussions")
    public Boolean getHas_discussions() {
        return has_discussions;
    }

    @JsonProperty("has_discussions")
    public void setHas_discussions(Boolean has_discussions) {
        this.has_discussions = has_discussions;
    }

    @JsonProperty("forks_count")
    public Integer getForks_count() {
        return forks_count;
    }

    @JsonProperty("forks_count")
    public void setForks_count(Integer forks_count) {
        this.forks_count = forks_count;
    }

    @JsonProperty("mirror_url")
    public Object getMirror_url() {
        return mirror_url;
    }

    @JsonProperty("mirror_url")
    public void setMirror_url(Object mirror_url) {
        this.mirror_url = mirror_url;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @JsonProperty("open_issues_count")
    public Integer getOpen_issues_count() {
        return open_issues_count;
    }

    @JsonProperty("open_issues_count")
    public void setOpen_issues_count(Integer open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    @JsonProperty("license")
    public License__1 getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(License__1 license) {
        this.license = license;
    }

    @JsonProperty("allow_forking")
    public Boolean getAllow_forking() {
        return allow_forking;
    }

    @JsonProperty("allow_forking")
    public void setAllow_forking(Boolean allow_forking) {
        this.allow_forking = allow_forking;
    }

    @JsonProperty("is_template")
    public Boolean getIs_template() {
        return is_template;
    }

    @JsonProperty("is_template")
    public void setIs_template(Boolean is_template) {
        this.is_template = is_template;
    }

    @JsonProperty("web_commit_signoff_required")
    public Boolean getWeb_commit_signoff_required() {
        return web_commit_signoff_required;
    }

    @JsonProperty("web_commit_signoff_required")
    public void setWeb_commit_signoff_required(Boolean web_commit_signoff_required) {
        this.web_commit_signoff_required = web_commit_signoff_required;
    }

    @JsonProperty("topics")
    public List<Object> getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(List<Object> topics) {
        this.topics = topics;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("forks")
    public Integer getForks() {
        return forks;
    }

    @JsonProperty("forks")
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    @JsonProperty("open_issues")
    public Integer getOpen_issues() {
        return open_issues;
    }

    @JsonProperty("open_issues")
    public void setOpen_issues(Integer open_issues) {
        this.open_issues = open_issues;
    }

    @JsonProperty("watchers")
    public Integer getWatchers() {
        return watchers;
    }

    @JsonProperty("watchers")
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    @JsonProperty("default_branch")
    public String getDefault_branch() {
        return default_branch;
    }

    @JsonProperty("default_branch")
    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
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
        sb.append(Parent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("node_id");
        sb.append('=');
        sb.append(((this.node_id == null)?"<null>":this.node_id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("full_name");
        sb.append('=');
        sb.append(((this.full_name == null)?"<null>":this.full_name));
        sb.append(',');
        sb.append("_private");
        sb.append('=');
        sb.append(((this._private == null)?"<null>":this._private));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("html_url");
        sb.append('=');
        sb.append(((this.html_url == null)?"<null>":this.html_url));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fork");
        sb.append('=');
        sb.append(((this.fork == null)?"<null>":this.fork));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("forks_url");
        sb.append('=');
        sb.append(((this.forks_url == null)?"<null>":this.forks_url));
        sb.append(',');
        sb.append("keys_url");
        sb.append('=');
        sb.append(((this.keys_url == null)?"<null>":this.keys_url));
        sb.append(',');
        sb.append("collaborators_url");
        sb.append('=');
        sb.append(((this.collaborators_url == null)?"<null>":this.collaborators_url));
        sb.append(',');
        sb.append("teams_url");
        sb.append('=');
        sb.append(((this.teams_url == null)?"<null>":this.teams_url));
        sb.append(',');
        sb.append("hooks_url");
        sb.append('=');
        sb.append(((this.hooks_url == null)?"<null>":this.hooks_url));
        sb.append(',');
        sb.append("issue_events_url");
        sb.append('=');
        sb.append(((this.issue_events_url == null)?"<null>":this.issue_events_url));
        sb.append(',');
        sb.append("events_url");
        sb.append('=');
        sb.append(((this.events_url == null)?"<null>":this.events_url));
        sb.append(',');
        sb.append("assignees_url");
        sb.append('=');
        sb.append(((this.assignees_url == null)?"<null>":this.assignees_url));
        sb.append(',');
        sb.append("branches_url");
        sb.append('=');
        sb.append(((this.branches_url == null)?"<null>":this.branches_url));
        sb.append(',');
        sb.append("tags_url");
        sb.append('=');
        sb.append(((this.tags_url == null)?"<null>":this.tags_url));
        sb.append(',');
        sb.append("blobs_url");
        sb.append('=');
        sb.append(((this.blobs_url == null)?"<null>":this.blobs_url));
        sb.append(',');
        sb.append("git_tags_url");
        sb.append('=');
        sb.append(((this.git_tags_url == null)?"<null>":this.git_tags_url));
        sb.append(',');
        sb.append("git_refs_url");
        sb.append('=');
        sb.append(((this.git_refs_url == null)?"<null>":this.git_refs_url));
        sb.append(',');
        sb.append("trees_url");
        sb.append('=');
        sb.append(((this.trees_url == null)?"<null>":this.trees_url));
        sb.append(',');
        sb.append("statuses_url");
        sb.append('=');
        sb.append(((this.statuses_url == null)?"<null>":this.statuses_url));
        sb.append(',');
        sb.append("languages_url");
        sb.append('=');
        sb.append(((this.languages_url == null)?"<null>":this.languages_url));
        sb.append(',');
        sb.append("stargazers_url");
        sb.append('=');
        sb.append(((this.stargazers_url == null)?"<null>":this.stargazers_url));
        sb.append(',');
        sb.append("contributors_url");
        sb.append('=');
        sb.append(((this.contributors_url == null)?"<null>":this.contributors_url));
        sb.append(',');
        sb.append("subscribers_url");
        sb.append('=');
        sb.append(((this.subscribers_url == null)?"<null>":this.subscribers_url));
        sb.append(',');
        sb.append("subscription_url");
        sb.append('=');
        sb.append(((this.subscription_url == null)?"<null>":this.subscription_url));
        sb.append(',');
        sb.append("commits_url");
        sb.append('=');
        sb.append(((this.commits_url == null)?"<null>":this.commits_url));
        sb.append(',');
        sb.append("git_commits_url");
        sb.append('=');
        sb.append(((this.git_commits_url == null)?"<null>":this.git_commits_url));
        sb.append(',');
        sb.append("comments_url");
        sb.append('=');
        sb.append(((this.comments_url == null)?"<null>":this.comments_url));
        sb.append(',');
        sb.append("issue_comment_url");
        sb.append('=');
        sb.append(((this.issue_comment_url == null)?"<null>":this.issue_comment_url));
        sb.append(',');
        sb.append("contents_url");
        sb.append('=');
        sb.append(((this.contents_url == null)?"<null>":this.contents_url));
        sb.append(',');
        sb.append("compare_url");
        sb.append('=');
        sb.append(((this.compare_url == null)?"<null>":this.compare_url));
        sb.append(',');
        sb.append("merges_url");
        sb.append('=');
        sb.append(((this.merges_url == null)?"<null>":this.merges_url));
        sb.append(',');
        sb.append("archive_url");
        sb.append('=');
        sb.append(((this.archive_url == null)?"<null>":this.archive_url));
        sb.append(',');
        sb.append("downloads_url");
        sb.append('=');
        sb.append(((this.downloads_url == null)?"<null>":this.downloads_url));
        sb.append(',');
        sb.append("issues_url");
        sb.append('=');
        sb.append(((this.issues_url == null)?"<null>":this.issues_url));
        sb.append(',');
        sb.append("pulls_url");
        sb.append('=');
        sb.append(((this.pulls_url == null)?"<null>":this.pulls_url));
        sb.append(',');
        sb.append("milestones_url");
        sb.append('=');
        sb.append(((this.milestones_url == null)?"<null>":this.milestones_url));
        sb.append(',');
        sb.append("notifications_url");
        sb.append('=');
        sb.append(((this.notifications_url == null)?"<null>":this.notifications_url));
        sb.append(',');
        sb.append("labels_url");
        sb.append('=');
        sb.append(((this.labels_url == null)?"<null>":this.labels_url));
        sb.append(',');
        sb.append("releases_url");
        sb.append('=');
        sb.append(((this.releases_url == null)?"<null>":this.releases_url));
        sb.append(',');
        sb.append("deployments_url");
        sb.append('=');
        sb.append(((this.deployments_url == null)?"<null>":this.deployments_url));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null)?"<null>":this.created_at));
        sb.append(',');
        sb.append("updated_at");
        sb.append('=');
        sb.append(((this.updated_at == null)?"<null>":this.updated_at));
        sb.append(',');
        sb.append("pushed_at");
        sb.append('=');
        sb.append(((this.pushed_at == null)?"<null>":this.pushed_at));
        sb.append(',');
        sb.append("git_url");
        sb.append('=');
        sb.append(((this.git_url == null)?"<null>":this.git_url));
        sb.append(',');
        sb.append("ssh_url");
        sb.append('=');
        sb.append(((this.ssh_url == null)?"<null>":this.ssh_url));
        sb.append(',');
        sb.append("clone_url");
        sb.append('=');
        sb.append(((this.clone_url == null)?"<null>":this.clone_url));
        sb.append(',');
        sb.append("svn_url");
        sb.append('=');
        sb.append(((this.svn_url == null)?"<null>":this.svn_url));
        sb.append(',');
        sb.append("homepage");
        sb.append('=');
        sb.append(((this.homepage == null)?"<null>":this.homepage));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("stargazers_count");
        sb.append('=');
        sb.append(((this.stargazers_count == null)?"<null>":this.stargazers_count));
        sb.append(',');
        sb.append("watchers_count");
        sb.append('=');
        sb.append(((this.watchers_count == null)?"<null>":this.watchers_count));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("has_issues");
        sb.append('=');
        sb.append(((this.has_issues == null)?"<null>":this.has_issues));
        sb.append(',');
        sb.append("has_projects");
        sb.append('=');
        sb.append(((this.has_projects == null)?"<null>":this.has_projects));
        sb.append(',');
        sb.append("has_downloads");
        sb.append('=');
        sb.append(((this.has_downloads == null)?"<null>":this.has_downloads));
        sb.append(',');
        sb.append("has_wiki");
        sb.append('=');
        sb.append(((this.has_wiki == null)?"<null>":this.has_wiki));
        sb.append(',');
        sb.append("has_pages");
        sb.append('=');
        sb.append(((this.has_pages == null)?"<null>":this.has_pages));
        sb.append(',');
        sb.append("has_discussions");
        sb.append('=');
        sb.append(((this.has_discussions == null)?"<null>":this.has_discussions));
        sb.append(',');
        sb.append("forks_count");
        sb.append('=');
        sb.append(((this.forks_count == null)?"<null>":this.forks_count));
        sb.append(',');
        sb.append("mirror_url");
        sb.append('=');
        sb.append(((this.mirror_url == null)?"<null>":this.mirror_url));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null)?"<null>":this.disabled));
        sb.append(',');
        sb.append("open_issues_count");
        sb.append('=');
        sb.append(((this.open_issues_count == null)?"<null>":this.open_issues_count));
        sb.append(',');
        sb.append("license");
        sb.append('=');
        sb.append(((this.license == null)?"<null>":this.license));
        sb.append(',');
        sb.append("allow_forking");
        sb.append('=');
        sb.append(((this.allow_forking == null)?"<null>":this.allow_forking));
        sb.append(',');
        sb.append("is_template");
        sb.append('=');
        sb.append(((this.is_template == null)?"<null>":this.is_template));
        sb.append(',');
        sb.append("web_commit_signoff_required");
        sb.append('=');
        sb.append(((this.web_commit_signoff_required == null)?"<null>":this.web_commit_signoff_required));
        sb.append(',');
        sb.append("topics");
        sb.append('=');
        sb.append(((this.topics == null)?"<null>":this.topics));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("forks");
        sb.append('=');
        sb.append(((this.forks == null)?"<null>":this.forks));
        sb.append(',');
        sb.append("open_issues");
        sb.append('=');
        sb.append(((this.open_issues == null)?"<null>":this.open_issues));
        sb.append(',');
        sb.append("watchers");
        sb.append('=');
        sb.append(((this.watchers == null)?"<null>":this.watchers));
        sb.append(',');
        sb.append("default_branch");
        sb.append('=');
        sb.append(((this.default_branch == null)?"<null>":this.default_branch));
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
