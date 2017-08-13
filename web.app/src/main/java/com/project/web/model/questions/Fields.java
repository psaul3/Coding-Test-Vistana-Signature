
package com.project.web.model.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "questionID",
    "question",
    "link-users-question1",
    "link-users-question3",
    "link-users-question2"
})
public class Fields {

    @JsonProperty("questionID")
    private Integer questionID;
    @JsonProperty("question")
    private String question;
    @JsonProperty("link-users-question1")
    private List<String> linkUsersQuestion1 = null;
    @JsonProperty("link-users-question3")
    private List<String> linkUsersQuestion3 = null;
    @JsonProperty("link-users-question2")
    private List<String> linkUsersQuestion2 = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("questionID")
    public Integer getQuestionID() {
        return questionID;
    }

    @JsonProperty("questionID")
    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty("link-users-question1")
    public List<String> getLinkUsersQuestion1() {
        return linkUsersQuestion1;
    }

    @JsonProperty("link-users-question1")
    public void setLinkUsersQuestion1(List<String> linkUsersQuestion1) {
        this.linkUsersQuestion1 = linkUsersQuestion1;
    }

    @JsonProperty("link-users-question3")
    public List<String> getLinkUsersQuestion3() {
        return linkUsersQuestion3;
    }

    @JsonProperty("link-users-question3")
    public void setLinkUsersQuestion3(List<String> linkUsersQuestion3) {
        this.linkUsersQuestion3 = linkUsersQuestion3;
    }

    @JsonProperty("link-users-question2")
    public List<String> getLinkUsersQuestion2() {
        return linkUsersQuestion2;
    }

    @JsonProperty("link-users-question2")
    public void setLinkUsersQuestion2(List<String> linkUsersQuestion2) {
        this.linkUsersQuestion2 = linkUsersQuestion2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
