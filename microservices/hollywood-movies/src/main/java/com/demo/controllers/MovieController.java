package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
@RequestMapping("/hollywood")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/movies")
	public Movie createNewMovie(@RequestBody Movie m) {
		return service.saveMovie(m);
	}
	@GetMapping("/movies")
	public List<Movie> fetchAllMovies() {
		return service.fetchMovies();
	}
	
}
