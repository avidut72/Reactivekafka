package com.kafka.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClientException extends Exception {
	
	private static final long serialVersionUID = -7865876628299983328L;
	
	private final Throwable cause;
	private final String errorMessage;
	private final HttpStatus status;
	
	public ClientException(Throwable cause, String errorMessage) {
		super();
		this.cause = cause;
		this.errorMessage = errorMessage;
		this.status = null;
	}

	public ClientException(String errorMessage, HttpStatus status) {
		super();
		this.cause = null;
		this.errorMessage = errorMessage;
		this.status = status;
	}
	
	

}
