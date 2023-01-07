package com.ttj.kerbauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/rest")
public class SampleRestController {
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest req){
        System.out.println("User: "+req.getRemoteUser());

        return "Hello, " + req.getRemoteUser() + " ! you are welcome!!!";
    }
}
