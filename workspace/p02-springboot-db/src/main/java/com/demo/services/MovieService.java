package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public Movie fetchMovieById(int id) {
		Optional<Movie> movie = repo.findById(id);
		if (movie.isPresent()) {
			return movie.get();
		}
		return null;
	}

	public Movie updateMovie(Movie movie) {
		if (movie != null) {
			if (fetchMovieById(movie.getId()) == null) {
				return null;
			}
			else {
				return repo.save(movie);
			}
		}
		return null;
	}

	public ResponseEntity<String> deleteMovieById(int id) {
		Movie movie = fetchMovieById(id);
		if (movie == null) {
			return ResponseEntity.notFound().build();
		}
		else {
			repo.delete(movie);
			return new ResponseEntity<>("Product has been deleted successfully.", HttpStatus.OK);
		}
	}
}
