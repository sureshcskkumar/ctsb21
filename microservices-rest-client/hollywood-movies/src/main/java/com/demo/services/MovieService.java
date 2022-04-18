package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public Movie saveMovie(Movie m) {
		System.out.println("Saving movie in db");
		System.out.println(m);
		return repo.save(m);
	}

	public List<Movie> fetchMovies() {
		return repo.findAll();
	}
	
}
