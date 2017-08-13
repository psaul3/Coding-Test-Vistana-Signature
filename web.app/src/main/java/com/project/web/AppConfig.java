package com.project.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Map<String, String> appMap() {
        final Map<String, String> appMap = new HashMap<>();
        appMap.put("airTable_users", "https://api.airtable.com/v0/appcCYmNtYTEo43Lg/users");
        appMap.put("airTable_questions", "https://api.airtable.com/v0/appcCYmNtYTEo43Lg/questions");
        appMap.put("airTable_apiKey", "key7IINqP0ttqA2w1");
        return appMap;
    }

}
