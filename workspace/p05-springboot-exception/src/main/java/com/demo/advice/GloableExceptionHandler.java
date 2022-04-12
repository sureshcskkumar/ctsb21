package com.demo.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exceptions.MovieException;

class ErrorResponse{
	private String message;
	private LocalDateTime now;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getNow() {
		return now;
	}
	public void setNow(LocalDateTime now) {
		this.now = now;
	}
	public ErrorResponse(String message, LocalDateTime now) {
		super();
		this.message = message;
		this.now = now;
	}
}

@ControllerAdvice
public class GloableExceptionHandler {

//	@ExceptionHandler(MovieNotFoundException.class)
//	public ResponseEntity<String> handle(MovieNotFoundException e) {
//		return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
//	}
	
	@ExceptionHandler(MovieException.class)
	public ResponseEntity<ErrorResponse> handle(MovieException e) {
		return new ResponseEntity<ErrorResponse>(
			new ErrorResponse(
				e.getMessage(), 
				LocalDateTime.now()
				), 
			
				HttpStatus.OK
		);
	}
	
	
}
