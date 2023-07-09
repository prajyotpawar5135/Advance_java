package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.app.entities.AccountType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

	//private Long id;
	@Column(length = 50)
	private String firstName;
	private String lastName;
	@Column(length = 50,nullable = false)
	private String email;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[@])[a-zA-Z]{5,10}$")
	private String password;
	private String accType;
	@Past
	private LocalDate dob;
	@PastOrPresent
	private LocalDate regDate;
	
	
}
