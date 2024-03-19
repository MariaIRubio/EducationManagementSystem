package com.exercise.educationmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/student")
    public String student(){
        return "student";
    }

    @GetMapping("/teacher")
    public String teacher(){
        return "teacher";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }


}
