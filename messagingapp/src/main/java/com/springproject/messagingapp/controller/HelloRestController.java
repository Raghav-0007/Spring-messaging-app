package com.springproject.messagingapp.controller;

import com.springproject.messagingapp.model.User;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // A simple get request to say hello
    @GetMapping
    public String sayHello(){
        return "Hello from Bridgelabz";
    }

    // get request with query
    @GetMapping("/q")
    public String showHello(@RequestParam String name){
        return "Hello, " + name + " from BridgeLabz";
    }

    // create a get request with path variable
    @GetMapping("/param/{name}")
    public String showPathHello(@PathVariable String name){
        return "Hello, " + name + " from BridgeLabz";
    }

    // create a post request
    @PostMapping("/post")
    public void postUser(@RequestBody User user){
        System.out.println(user.getFirstName());
    }
}
