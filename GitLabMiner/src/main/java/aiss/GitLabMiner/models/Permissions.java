package aiss.GitLabMiner.models;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Permissions {

    @JsonProperty("project_access")
    private Object projectAccess;
    @JsonProperty("group_access")
    private Object groupAccess;
    public Permissions() {
    }

    public Permissions(Object projectAccess, Object groupAccess) {
        super();
        this.projectAccess = projectAccess;
        this.groupAccess = groupAccess;
    }

    @JsonProperty("project_access")
    public Object getProjectAccess() {
        return projectAccess;
    }

    @JsonProperty("project_access")
    public void setProjectAccess(Object projectAccess) {
        this.projectAccess = projectAccess;
    }

    @JsonProperty("group_access")
    public Object getGroupAccess() {
        return groupAccess;
    }

    @JsonProperty("group_access")
    public void setGroupAccess(Object groupAccess) {
        this.groupAccess = groupAccess;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Permissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projectAccess");
        sb.append('=');
        sb.append(((this.projectAccess == null)?"<null>":this.projectAccess));
        sb.append(',');
        sb.append("groupAccess");
        sb.append('=');
        sb.append(((this.groupAccess == null)?"<null>":this.groupAccess));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}