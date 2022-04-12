package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController = @Controller + @ResponseBody
public class DemoController {

	@GetMapping("/greet")
	@ResponseBody
	public String welcome() {
		System.out.println("in demo controller");
		return "Welcome User";
	}
	
	@GetMapping("/home")
	public String home() {
		System.out.println("in home method");
		return "index";
	}
	

	/* -------- problems / erros ------- */
	
	@PostMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	} 

	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greetUser(@PathVariable String name) {
		return "Welcome "+name.substring(0, 3).toUpperCase();
	}
	
	// /greetme -> 404 

	
	
}