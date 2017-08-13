package com.project.web.controller;

import com.project.web.model.Question;
import com.project.web.model.User;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import com.project.web.helper.FileHelper;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Controller
@SessionAttributes({"user"})
@RequestMapping
public class UserController {

    @RequestMapping(value = "/signup-questions", method = RequestMethod.POST)
    public String handleRequestById(@ModelAttribute("user") User user, Model model,
                                    HttpServletRequest request, SessionStatus sessionStatus) throws IOException {

        model.addAttribute("title", "Sign Up");

        //Validate 'username' and 'birthdate'
        if(user.get_userName().isEmpty() || user.get_birthdate().isEmpty()) {

            model.addAttribute("error", String.format("%s can't be empty.",
                    (user.get_userName().isEmpty() ? "Username" : "Birthdate")) );
            sessionStatus.setComplete();
            return "signup";
        } else {
            model.addAttribute("questionsList", FileHelper.getQuestions("/questions.txt"));
            return "signup-questions";
        }
    }

    @RequestMapping(value = "/signup-complete", method = RequestMethod.POST)
    public String handleRequestById(@ModelAttribute("user") User user, Model model,
                                    HttpServletRequest request, SessionStatus sessionStatus,
                                    @RequestParam("question1") String question1,
                                    @RequestParam("answer1") String answer1,
                                    @RequestParam("question2") String question2,
                                    @RequestParam("answer2") String answer2,
                                    @RequestParam("question3") String question3,
                                    @RequestParam("answer3") String answer3) {

        model.addAttribute("title", "Home");
        if(!question1.isEmpty() && question2.isEmpty() && question3.isEmpty() &&
                !answer1.isEmpty() && answer2.isEmpty() && answer3.isEmpty()){

            user.addQuestion(new Question(question1,answer1));
            user.addQuestion(new Question(question2,answer2));
            user.addQuestion(new Question(question3,answer3));

            return "home";
        }
        else{
            model.addAttribute("error", "Please select and answer each question.");
            sessionStatus.setComplete();
            return "signup-questions";
        }
    }


    @ModelAttribute("user")
    public User getUser (@RequestParam("username") String username,
                         @RequestParam("birthdate") String birthdate) throws Exception {

        return new User(username.isEmpty() ? "" : username, birthdate.isEmpty()? "" : birthdate);
    }
}
