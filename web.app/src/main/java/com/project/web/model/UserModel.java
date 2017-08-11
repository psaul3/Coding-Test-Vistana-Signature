package com.project.web.model;

import java.util.Date;

public class UserModel {

    private String username;
    private Date birthdate;
    private String[] loginQuestions, loginAnswers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String[] getLoginQuestions() {
        return loginQuestions;
    }

    public void setLoginQuestions(String[] loginQuestions) {
        this.loginQuestions = loginQuestions;
    }

    public String[] getLoginAnswers() {
        return loginAnswers;
    }

    public void setLoginAnswers(String[] loginAnswers) {
        this.loginAnswers = loginAnswers;
    }
}
