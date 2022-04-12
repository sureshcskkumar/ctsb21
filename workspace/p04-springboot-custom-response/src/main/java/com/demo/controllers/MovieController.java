package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
// @CrossOrigin
//@CrossOrigin({"http://localhost:4200", "https://hoppscotch.io"})
@RequestMapping("/api/v1")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@GetMapping(value="/movies", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Movie> findAllMovies(){
		System.out.println("in movie controller");
		return movieService.findAllMovies();
	}
	@GetMapping("/movies/{id}")
	public Movie findMovieById(@PathVariable int id){
		return movieService.findById(id);
	}
	@GetMapping("/movies/search") // /movies/search?title="this is romantic movie"
	public List<Movie> findMovieByTitle(@RequestParam String title){
		return movieService.findByTitle(title);
	}
	@PostMapping(value="/movies", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public Movie addNewMovie(@RequestBody Movie m){
		return movieService.add(m);
	}

	@DeleteMapping("/movies/{id}")
public void deleteMovie(@PathVariable int id){
	movieService.deleteMovie(id);
}

//	@PutMapping
//	updateMovie()
	
}
