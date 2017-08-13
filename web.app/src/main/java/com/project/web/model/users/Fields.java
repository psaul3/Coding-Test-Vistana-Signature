
package com.project.web.model.users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    "username",
    "birthdate",
    "questions1",
    "loginQuestion1",
    "questions2",
    "loginQuestion2",
    "questions3",
    "loginQuestion3",
    "loginAnswer1",
    "loginAnswer2",
    "loginAnswer3"
})
public class Fields {

    @JsonProperty("username")
    private String username;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("questions1")
    private List<String> questions1 = null;
    @JsonProperty("loginQuestion1")
    private List<String> loginQuestion1 = null;
    @JsonProperty("questions2")
    private List<String> questions2 = null;
    @JsonProperty("loginQuestion2")
    private List<String> loginQuestion2 = null;
    @JsonProperty("questions3")
    private List<String> questions3 = null;
    @JsonProperty("loginQuestion3")
    private List<String> loginQuestion3 = null;
    @JsonProperty("loginAnswer1")
    private String loginAnswer1;
    @JsonProperty("loginAnswer2")
    private String loginAnswer2;
    @JsonProperty("loginAnswer3")
    private String loginAnswer3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Fields withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("birthdate")
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Fields withBirthdate(String birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    @JsonProperty("questions1")
    public List<String> getQuestions1() {
        return questions1;
    }

    @JsonProperty("questions1")
    public void setQuestions1(List<String> questions1) {
        this.questions1 = questions1;
    }

    public Fields withQuestions1(List<String> questions1) {
        this.questions1 = questions1;
        return this;
    }

    @JsonProperty("loginQuestion1")
    public List<String> getLoginQuestion1() {
        return loginQuestion1;
    }

    @JsonProperty("loginQuestion1")
    public void setLoginQuestion1(List<String> loginQuestion1) {
        this.loginQuestion1 = loginQuestion1;
    }

    public Fields withLoginQuestion1(List<String> loginQuestion1) {
        this.loginQuestion1 = loginQuestion1;
        return this;
    }

    @JsonProperty("questions2")
    public List<String> getQuestions2() {
        return questions2;
    }

    @JsonProperty("questions2")
    public void setQuestions2(List<String> questions2) {
        this.questions2 = questions2;
    }

    public Fields withQuestions2(List<String> questions2) {
        this.questions2 = questions2;
        return this;
    }

    @JsonProperty("loginQuestion2")
    public List<String> getLoginQuestion2() {
        return loginQuestion2;
    }

    @JsonProperty("loginQuestion2")
    public void setLoginQuestion2(List<String> loginQuestion2) {
        this.loginQuestion2 = loginQuestion2;
    }

    public Fields withLoginQuestion2(List<String> loginQuestion2) {
        this.loginQuestion2 = loginQuestion2;
        return this;
    }

    @JsonProperty("questions3")
    public List<String> getQuestions3() {
        return questions3;
    }

    @JsonProperty("questions3")
    public void setQuestions3(List<String> questions3) {
        this.questions3 = questions3;
    }

    public Fields withQuestions3(List<String> questions3) {
        this.questions3 = questions3;
        return this;
    }

    @JsonProperty("loginQuestion3")
    public List<String> getLoginQuestion3() {
        return loginQuestion3;
    }

    @JsonProperty("loginQuestion3")
    public void setLoginQuestion3(List<String> loginQuestion3) {
        this.loginQuestion3 = loginQuestion3;
    }

    public Fields withLoginQuestion3(List<String> loginQuestion3) {
        this.loginQuestion3 = loginQuestion3;
        return this;
    }

    @JsonProperty("loginAnswer1")
    public String getLoginAnswer1() {
        return loginAnswer1;
    }

    @JsonProperty("loginAnswer1")
    public void setLoginAnswer1(String loginAnswer1) {
        this.loginAnswer1 = loginAnswer1;
    }

    public Fields withLoginAnswer1(String loginAnswer1) {
        this.loginAnswer1 = loginAnswer1;
        return this;
    }

    @JsonProperty("loginAnswer2")
    public String getLoginAnswer2() {
        return loginAnswer2;
    }

    @JsonProperty("loginAnswer2")
    public void setLoginAnswer2(String loginAnswer2) {
        this.loginAnswer2 = loginAnswer2;
    }

    public Fields withLoginAnswer2(String loginAnswer2) {
        this.loginAnswer2 = loginAnswer2;
        return this;
    }

    @JsonProperty("loginAnswer3")
    public String getLoginAnswer3() {
        return loginAnswer3;
    }

    @JsonProperty("loginAnswer3")
    public void setLoginAnswer3(String loginAnswer3) {
        this.loginAnswer3 = loginAnswer3;
    }

    public Fields withLoginAnswer3(String loginAnswer3) {
        this.loginAnswer3 = loginAnswer3;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Fields withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
