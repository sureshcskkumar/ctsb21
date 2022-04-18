package com.demo.controllers;

import java.util.List;

import com.demo.model.HollywoodMovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shows")
public class BookMyShowController {
    
    @Autowired
    private RestTemplate template;
    
    @GetMapping("")
    public String test(){
        return "Its working...";
    }

    @GetMapping("hollywood-movies")
    public List<HollywoodMovie> getAllHollywoodMovies(){

        /* Remove LoadBalanced annotation from the RestTemplate bean */
        // String url = "http://localhost:8989/hollywood/movies";
        
        // LoadBalanced annotation is required with RestTemplate bean
        String url = "lb://HOLLYWOOD-MOVIES/hollywood/movies";
        HttpMethod method = HttpMethod.GET;
        RequestEntity data = null;
        ParameterizedTypeReference type = new ParameterizedTypeReference<List<HollywoodMovie>>() {};
        
        ResponseEntity<List<HollywoodMovie>> response = template.exchange(url, method, data, type);

        return response.getBody();
    }
}