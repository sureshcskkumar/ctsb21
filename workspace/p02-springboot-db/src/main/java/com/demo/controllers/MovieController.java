package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
@RequestMapping("/app")
public class MovieController {

	@Autowired
	private MovieService service;
	
	// POST -> http://localhost:8080/app/movies
	@PostMapping("/movies")
	public Movie createNewMovie(@RequestBody Movie m) {
		return service.saveMovie(m);
	}
	@GetMapping("/movies")
	public List<Movie> fetchAllMovies() {
		return service.fetchMovies();
	}
	
	@GetMapping("/movies/{id}")
	public Movie fetchMovieById(@PathVariable int id) {
		return service.fetchMovieById(id);
	}
	
	@PutMapping("/movies")
	public Movie updateMovie(@RequestBody Movie movie) {
		return service.updateMovie(movie);
	}
	
	@DeleteMapping("/movies/{id}")
	public ResponseEntity<String> deleteMovieById(@PathVariable int id) {
		return service.deleteMovieById(id);
	}
}
