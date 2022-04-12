package com.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
	}

	@Cacheable(key="#id", value="movie-store")
//	@Cacheable(key="{#name, #id}", value="movie-store")
	public Movie findById(int id) {
		System.out.println("Service: Finding by id: "+id+": "+LocalDateTime.now());
		Optional<Movie> optional = movieRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			System.out.println("Database does not have any movie with id: "+id);
			return null;
		}
	}

	public List<Movie> findByTitle(String title) {
		return movieRepository.findByTitle(title);
	}

	public Movie add(Movie m) {
		return movieRepository.save(m);
	}

	
	/*
	
	@PutMappint("/{id}") --> controller
	
	@CachePut(key="#id", value="movie-store")
	public boolean updateMovie(@PathVariable int id, @RequestBody Movie m){}
	*/
	
	
	
	/*
	@CacheEvict(key="#id", value="movie-store")
	deleteMethod
	
	*/
}
