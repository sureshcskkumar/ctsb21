package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import com.demo.models.Book;

@RestController
@RequestMapping("kafka")
public class BookController {

	@Autowired
    private KafkaTemplate<String, Book> kafkaTemplate;
	
	private static final String TOPIC = "kafka_topic";

    @GetMapping("/publish")
    public String publishBook() {

        int id = (int)(Math.floor(Math.random()*100));
        Book book = new Book(id, "Java Microservices", "Mark Carl", (((id*10)/3)-20)*2);
        kafkaTemplate.send(TOPIC, book);

        return "Published successfully: "+LocalDateTime.now()+book.toString();
    }

    @GetMapping("/publish/{title}")
    public String publishBook(@PathVariable String title) {

        int id = (int)(Math.floor(Math.random()*100));
        Book book = new Book(id, title, "Mark Carl", (((id*10)/3)-20)*2);
        kafkaTemplate.send(TOPIC, book);

        return "Published successfully";
    }
   

}
