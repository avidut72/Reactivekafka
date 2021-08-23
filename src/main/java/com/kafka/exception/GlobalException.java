package com.kafka.exception;

import org.springframework.http.HttpStatus;

public class GlobalException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7330625987985460851L;
	
	private final String message;
	private final HttpStatus status;
	
	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public GlobalException(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
		
	}

}
