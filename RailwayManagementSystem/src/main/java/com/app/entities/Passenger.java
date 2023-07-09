package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@JsonIgnoreType
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Passenger extends BaseEntity{

	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	@Column(length=30)
	private String email;
	@Column(length=30)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private ReservationType reservation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Railway railId;
//1,"praj@123","prajyot","pawar","1234","A1",1
//(1,"safari"	
	
}
