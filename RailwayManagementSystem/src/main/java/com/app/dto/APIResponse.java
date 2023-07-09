package com.app.dto;

public class APIResponse {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public APIResponse(String message) {
		super();
		this.message = message;
	}
	
}
