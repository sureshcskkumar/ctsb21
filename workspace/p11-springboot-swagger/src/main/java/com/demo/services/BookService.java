package com.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Book;
import com.demo.repositories.BookRepository;

//@Repository, @Service, @Component, @Configuration
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	public Book findById(int id) {
		System.out.println("Trying to get book with id: "+id);
		System.out.println(LocalDateTime.now());
		Optional<Book> optional = bookRepository.findById(id);
		if(optional.isPresent()) {
			Book book = optional.get();
			return book;
		} else {
			// throw exception
			throw new RuntimeException("Book with id "+id+" is not found in database");
		}
	}
	public Book saveBook(Book b) {
		return bookRepository.save(b);
	}

	public Book updateBook(Book b) {
		if(bookRepository.existsById(b.getId())) {
			return bookRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid id, update operation failed");
		}
	}
	
	public boolean deleteBook(int id) {
		boolean isFound = bookRepository.existsById(id);
		bookRepository.deleteById(id);
		return isFound;
	}
}
