package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.exceptions.MovieException;
import com.demo.services.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@GetMapping("")
	public List<Movie> findAllMovies(){
		System.out.println("in movie controller");
		return movieService.findAllMovies();
	}
	@GetMapping("/{id}")
	public Movie findMovieById(@PathVariable int id) throws MovieException{
		return movieService.findById(id);
	}
	@GetMapping("/search") // /movies/search?title="this is romantic movie"
	public List<Movie> findMovieByTitle(@RequestParam String title){
		return movieService.findByTitle(title);
	}
	@PostMapping("")
	public Movie addNewMovie(@RequestBody Movie m){
		return movieService.add(m);
	}

//	@DeleteMapping
	//	deleteMovie()
	
//	@PutMapping
//	updateMovie()
	
}
