package com.ttj.kerbauth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/auth")
public class SpringController {
    @RequestMapping("/login")
    public String login(){
        return "loginpage";
    }

}
