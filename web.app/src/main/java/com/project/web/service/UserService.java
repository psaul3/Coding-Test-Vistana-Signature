package com.project.web.service;

import com.project.web.model.users.Records;
import org.springframework.web.client.RestTemplate;

import static com.project.web.service.AirTableApiService.airTable_api;
import static com.project.web.service.AirTableApiService.airTable_apiKey;

public class UserService {

    private final String endpoint;
    private final RestTemplate rest;

    public UserService() {
        this.endpoint = airTable_api + "/users?api_key=" + airTable_apiKey;
        this.rest = new RestTemplate();
    }

    public Records getAll() {
        return rest.getForObject(endpoint, Records.class);
    }

}
