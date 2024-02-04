package com.example.practisewithoutsequrity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/full")
    public String showLoginPage(){
        return "Login";
    }



}