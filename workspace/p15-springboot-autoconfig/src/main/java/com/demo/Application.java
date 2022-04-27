package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.api.MessageConverter;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private MessageConverter converter;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("App is working");
		converter.translate("abcdefg");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
