package com.project.web.controller;

import com.project.web.model.questions.Questions;
import com.project.web.service.QuestionsService;
import com.project.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    private final UserService userService = new UserService();
    private final QuestionsService questionService = new QuestionsService();

    @Autowired
    public MainController() {
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        logger.debug("index() is executed!");

        model.addAttribute("userList", userService.getAll());
        model.addAttribute("title", "Hello,");
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

    @RequestMapping(value = "/signup-questions", method = RequestMethod.POST)
    public String signUp(Model model,
                         @RequestParam("username") String username,
                         @RequestParam("month") String month,
                         @RequestParam("day") String day,
                         @RequestParam("year") String year) throws ParseException {

        LocalDate birthdate = null;
        if(null != month && null != day && null != year){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

            String dateString = String.format( "%s/%s/%s" , day, month, year);

            birthdate = LocalDate.parse(dateString, formatter);

            model.addAttribute("birthdate", birthdate);
        }

        model.addAttribute("username", username);

        // Validate that 'username' and 'birthdate' are not empty.
        if(null != username && null != birthdate) {
            Questions questionsList = questionService.getAll();

            model.addAttribute("questionsList", questionsList);

            return "signup-questions";
        }
        else{
            model.addAttribute("error", (null == username || username.isEmpty() ?
                            "Username was empty. Please enter a Username."
                    : "Birthdate was empty. Please enter a Birthdate."));

            return "signup";
        }
    }

    @RequestMapping(value="/signup-complete", method = RequestMethod.POST)
    public String signupComplete(Model model) {



        return "signup-complete";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home(Model model) {

        return "welcome";
    }


}
