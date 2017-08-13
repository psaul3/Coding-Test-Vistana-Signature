package com.project.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

    private final String _userName;
    private final String _birthdate;
    private List<Question> _questions = new ArrayList<>();

    public User(String username, String birthdate){
        _userName = username;
        _birthdate = birthdate;
    }

    public String get_userName() {
        return _userName;
    }

    public String get_birthdate() {
        return _birthdate;
    }

    public void addQuestion(Question question){
        _questions.add(question);
    }

    public List<Question> get_questions() {
        return _questions;
    }
}
