package com.project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    public MainController() {
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        logger.debug("index() is executed!");

        model.addAttribute("title", "Home");
        model.addAttribute("description", "Please login or sign up.");

        return "home";
    }

    @RequestMapping(value = "/signup")
    public String signup(){

        return "signup";
    }


}
