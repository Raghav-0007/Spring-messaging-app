package com.springproject.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // A simple get request to say hello
    @GetMapping
    public String sayHello(){
        return "Hello from Bridgelabz";
    }

}
