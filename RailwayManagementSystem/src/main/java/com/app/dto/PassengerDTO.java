package com.app.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.app.entities.Railway;
import com.app.entities.ReservationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


public class PassengerDTO {

	@NotNull(message="name cannot be empty")
	private String firstName;
	
	private String lastName;
	@NotNull(message="email cannot be empty")
	private String email;
	private String password;
	
	private String reservation;
	private Long railId;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
	public Long getRailId() {
		return railId;
	}
	public void setRailId(Long railId) {
		this.railId = railId;
	}
	public PassengerDTO(@NotNull(message = "name cannot be empty") String firstName, String lastName,
			@NotNull(message = "email cannot be empty") String email, String password, String reservation,
			Long railId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.reservation = reservation;
		this.railId = railId;
	}
	public PassengerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassengerDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", reservation=" + reservation + ", railId=" + railId + "]";
	}
	
	

	
	
}
