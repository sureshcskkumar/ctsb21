package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.exceptions.MovieException;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
	}

	public Movie findById(int id) throws MovieException {
		System.out.println("finding movie by id: "+id);
		Optional<Movie> optional = movieRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			System.out.println("Database does not have any movie with id: "+id);
			throw new MovieException("Database does not have any movie with id: "+id);
		}
	}

	public List<Movie> findByTitle(String title) {
		return movieRepository.findByTitle(title);
	}

	public Movie add(Movie m) {
		return movieRepository.save(m);
	}

}
