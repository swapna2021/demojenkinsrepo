package com.graymatter.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionClass {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException rnf){
		return new ResponseEntity<>("no id present",HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException nse){
		return new ResponseEntity<>("the requested id not exists",HttpStatus.NOT_FOUND);
	}
	
	
	
}
