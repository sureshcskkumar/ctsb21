package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("")
    public String greetUser(){
        return "Welcome user";
    }
    @GetMapping("/{uname}")
    public String greetUser(@PathVariable String uname){
        return "Welcome "+uname;
    }

}