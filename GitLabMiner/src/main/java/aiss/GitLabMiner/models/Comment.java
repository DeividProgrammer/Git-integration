package aiss.GitLabMiner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) // tabla principal comentarios
public class Comment {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("body")
    private String body;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("type") //propiedades extras
    private Object type;
    @JsonProperty("attachment")
    private Object attachment;
    @JsonProperty("system")
    private Boolean system;
    @JsonProperty("noteable_id")
    private Integer noteableId;
    @JsonProperty("noteable_type")
    private String noteableType;
    @JsonProperty("project_id")
    private Integer projectId;
    @JsonProperty("noteable_iid")
    private Object noteableIid;
    @JsonProperty("resolvable")
    private Boolean resolvable;

    /**
     * No args constructor for use in serialization
     *
     */
    public Comment() {
    }

    /**
     * @param id
     * @param body
     * @param createdAt
     * @param updatedAt
     * @param author
     * @param type
     * @param noteableId
     * @param system
     * @param attachment
     * @param resolvable
     * @param noteableIid
     * @param noteableType
     * @param projectId
     */
    public Comment(Integer id, Object type, String body, Object attachment, Author author,
                   String createdAt, String updatedAt, Boolean system, Integer noteableId,
                   String noteableType, Integer projectId, Object noteableIid, Boolean resolvable) {
        super();
        this.id = id;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.author = author;
        this.type = type;
        this.attachment = attachment;
        this.system = system;
        this.noteableId = noteableId;
        this.noteableType = noteableType;
        this.projectId = projectId;
        this.noteableIid = noteableIid;
        this.resolvable = resolvable;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("attachment")
    public Object getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("system")
    public Boolean getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(Boolean system) {
        this.system = system;
    }

    @JsonProperty("noteable_id")
    public Integer getNoteableId() {
        return noteableId;
    }

    @JsonProperty("noteable_id")
    public void setNoteableId(Integer noteableId) {
        this.noteableId = noteableId;
    }

    @JsonProperty("noteable_type")
    public String getNoteableType() {
        return noteableType;
    }

    @JsonProperty("noteable_type")
    public void setNoteableType(String noteableType) {
        this.noteableType = noteableType;
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("noteable_iid")
    public Object getNoteableIid() {
        return noteableIid;
    }

    @JsonProperty("noteable_iid")
    public void setNoteableIid(Object noteableIid) {
        this.noteableIid = noteableIid;
    }

    @JsonProperty("resolvable")
    public Boolean getResolvable() {
        return resolvable;
    }

    @JsonProperty("resolvable")
    public void setResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null)?"<null>":this.attachment));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("noteableId");
        sb.append('=');
        sb.append(((this.noteableId == null)?"<null>":this.noteableId));
        sb.append(',');
        sb.append("noteableType");
        sb.append('=');
        sb.append(((this.noteableType == null)?"<null>":this.noteableType));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("noteableIid");
        sb.append('=');
        sb.append(((this.noteableIid == null)?"<null>":this.noteableIid));
        sb.append(',');
        sb.append("resolvable");
        sb.append('=');
        sb.append(((this.resolvable == null)?"<null>":this.resolvable));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}