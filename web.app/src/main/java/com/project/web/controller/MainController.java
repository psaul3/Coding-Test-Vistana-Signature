package com.project.web.controller;

import com.project.web.model.Records;
import com.project.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");
        Records recordList = userService.getAll();

        model.put("userList", recordList);
        model.put("title", "Hello,");
        model.put("description", "Please login or sign up.");

        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){

        return "login";
    }

//    @RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
//    public String loginUser(Map<String, Object> model) {
//
//        return "login";
//    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUp(Map<String, Object> model){

        return "signup";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home(Map<String, Object> model) {

        return "welcome";
    }


}
