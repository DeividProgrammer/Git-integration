package aiss.GitLabMiner.models;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainerExpirationPolicy {

    @JsonProperty("cadence")
    private String cadence;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("keep_n")
    private Integer keepN;
    @JsonProperty("older_than")
    private String olderThan;
    @JsonProperty("name_regex")
    private String nameRegex;
    @JsonProperty("name_regex_keep")
    private Object nameRegexKeep;
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public ContainerExpirationPolicy() {
    }

    /**
     *
     * @param nameRegex
     * @param nameRegexKeep
     * @param olderThan
     * @param keepN
     * @param nextRunAt
     * @param cadence
     * @param enabled
     */
    public ContainerExpirationPolicy(String cadence, Boolean enabled, Integer keepN, String olderThan, String nameRegex, Object nameRegexKeep, String nextRunAt) {
        super();
        this.cadence = cadence;
        this.enabled = enabled;
        this.keepN = keepN;
        this.olderThan = olderThan;
        this.nameRegex = nameRegex;
        this.nameRegexKeep = nameRegexKeep;
        this.nextRunAt = nextRunAt;
    }

    @JsonProperty("cadence")
    public String getCadence() {
        return cadence;
    }

    @JsonProperty("cadence")
    public void setCadence(String cadence) {
        this.cadence = cadence;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("keep_n")
    public Integer getKeepN() {
        return keepN;
    }

    @JsonProperty("keep_n")
    public void setKeepN(Integer keepN) {
        this.keepN = keepN;
    }

    @JsonProperty("older_than")
    public String getOlderThan() {
        return olderThan;
    }

    @JsonProperty("older_than")
    public void setOlderThan(String olderThan) {
        this.olderThan = olderThan;
    }

    @JsonProperty("name_regex")
    public String getNameRegex() {
        return nameRegex;
    }

    @JsonProperty("name_regex")
    public void setNameRegex(String nameRegex) {
        this.nameRegex = nameRegex;
    }

    @JsonProperty("name_regex_keep")
    public Object getNameRegexKeep() {
        return nameRegexKeep;
    }

    @JsonProperty("name_regex_keep")
    public void setNameRegexKeep(Object nameRegexKeep) {
        this.nameRegexKeep = nameRegexKeep;
    }

    @JsonProperty("next_run_at")
    public String getNextRunAt() {
        return nextRunAt;
    }

    @JsonProperty("next_run_at")
    public void setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerExpirationPolicy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cadence");
        sb.append('=');
        sb.append(((this.cadence == null)?"<null>":this.cadence));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("keepN");
        sb.append('=');
        sb.append(((this.keepN == null)?"<null>":this.keepN));
        sb.append(',');
        sb.append("olderThan");
        sb.append('=');
        sb.append(((this.olderThan == null)?"<null>":this.olderThan));
        sb.append(',');
        sb.append("nameRegex");
        sb.append('=');
        sb.append(((this.nameRegex == null)?"<null>":this.nameRegex));
        sb.append(',');
        sb.append("nameRegexKeep");
        sb.append('=');
        sb.append(((this.nameRegexKeep == null)?"<null>":this.nameRegexKeep));
        sb.append(',');
        sb.append("nextRunAt");
        sb.append('=');
        sb.append(((this.nextRunAt == null)?"<null>":this.nextRunAt));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}