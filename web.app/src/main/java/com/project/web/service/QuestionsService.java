package com.project.web.service;

import com.project.web.model.questions.Questions;
import org.springframework.web.client.RestTemplate;

import static com.project.web.service.AirTableApiService.airTable_api;
import static com.project.web.service.AirTableApiService.airTable_apiKey;

public class QuestionsService {

    private final String endpoint;
    private final RestTemplate rest;

    public QuestionsService() {
        this.endpoint = airTable_api + "/questions?api_key=" + airTable_apiKey;
        this.rest = new RestTemplate();
    }

    public Questions getAll() {
        return rest.getForObject(endpoint, Questions.class);
    }

}