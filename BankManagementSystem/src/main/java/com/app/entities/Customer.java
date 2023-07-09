package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@JsonIgnoreType
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="password")
public class Customer extends BaseEntity{

	
	private String firstName;
	private String lastName;
	
	private String email;

	private String password;
	@Enumerated(EnumType.STRING)

	private AccountType accType;
	
	private LocalDate dob;
	
	private LocalDate regDate;

	
}
