package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Book;
import com.demo.services.BookService;

@RestController
@CrossOrigin(origins = {"https://hoppscotch.io", "http://localhost:4200"})
public class BookController {
	
	@Autowired
	private BookService bookService; // new BookService();

	@GetMapping(value = "/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	@GetMapping("books/{id}")
	public Book findById(@PathVariable int id) {
		return bookService.findById(id);
	}
	@PostMapping("/books")
	public ResponseEntity<?> saveBook(@RequestBody Book b) {
		return new ResponseEntity<Book>(bookService.saveBook(b), HttpStatus.CREATED);
	}
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book b) {
		return bookService.updateBook(b);
	}
	@DeleteMapping("/books/{id}")
	public boolean deleteBook(@PathVariable int id) {
		return bookService.deleteBook(id);
	}
}
