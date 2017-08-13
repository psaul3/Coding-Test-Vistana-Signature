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
        return appMap;
    }

}
