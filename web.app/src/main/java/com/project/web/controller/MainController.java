package com.project.web.controller;

import org.springframework.stereotype.Controller;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");

        model.put("title", "Hello,");
        model.put("description", "Please login or sign up.");

        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){

        return "login";
    }


}
