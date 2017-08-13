package com.project.web.model;

import java.io.Serializable;

public class Question implements Serializable{

    private final String _question;
    private final String _answer;

    public Question(String question, String answer) {
        _question = question;
        _answer = answer;
    }

    public String get_question() {
        return _question;
    }

    public String get_answer() {
        return _answer;
    }
}
