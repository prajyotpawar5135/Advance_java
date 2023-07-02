package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RequestDTO {

	@NotBlank(message="invalid email format")
	@Email(message="invalid email format")
	private String email;
	@NotBlank(message="invalid password format")
	private String password;
	
	
	@Override
	public String toString() {
		return "RequestDTO [email=" + email + ", password=" + password + "]";
	}

	
	
}









