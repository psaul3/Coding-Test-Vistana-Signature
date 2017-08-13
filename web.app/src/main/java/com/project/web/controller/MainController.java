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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){

        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUp(Model model){

        return "signup";
    }

//    @RequestMapping(value = "/signup-questions.txt", method = RequestMethod.POST)
//    public String signUp(Model model,
//                         @RequestParam("username") String username,
//                         @RequestParam("month") String month,
//                         @RequestParam("day") String day,
//                         @RequestParam("year") String year) throws ParseException {
//
//        LocalDate birthdate = null;
//        if(null != month && null != day && null != year){
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
//
//            String dateString = String.format( "%s/%s/%s" , day, month, year);
//
//            birthdate = LocalDate.parse(dateString, formatter);
//
//            model.addAttribute("birthdate", birthdate);
//        }
//
//        model.addAttribute("username", username);
//
//        // Validate that 'username' and 'birthdate' are not empty.
//        if(null != username && null != birthdate) {
//
//            return "signup-questions.txt";
//        }
//        else{
//            model.addAttribute("error", (null == username || username.isEmpty() ?
//                            "Username was empty. Please enter a Username."
//                    : "Birthdate was empty. Please enter a Birthdate."));
//
//            return "signup";
//        }
//    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home(Model model) {

        return "welcome";
    }


}
