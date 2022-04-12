package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Movie findById(int id) {
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
		// validation code
		return movieRepository.save(m);
	}

	public void deleteMovie(int id){
		movieRepository.deleteById(id);
	}

}
