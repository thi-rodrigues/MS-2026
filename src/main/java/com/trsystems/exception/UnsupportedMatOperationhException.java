package com.trsystems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMatOperationhException extends RuntimeException {
	private static final long serialVersionUID = 2275278998731657095L;

	public UnsupportedMatOperationhException(String message) {
		super(message);
	}

}
