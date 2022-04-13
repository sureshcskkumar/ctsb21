package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/user")
    public String greetUser(){
        return "Welcome user";
    }
    @GetMapping("/user/{uname}")
    public String greetUser(@PathVariable String uname){
        return "Welcome "+uname;
    }


    // restricted
    @GetMapping("/home")
    public String home(){
        return "Home page";
    }

}