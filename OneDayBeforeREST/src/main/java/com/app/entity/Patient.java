package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="patient")
@JsonIgnoreType
public class Patient extends BaseEntity{

	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	@Column(length=30)
	private String email;
	private double fees;
	private LocalDate admDate;
	private LocalDate disDate;

	
	@Column(length=30)
	private String disease;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="hospId")
	private Hospital hospId;

	
	
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	
	
	public LocalDate getAdmDate() {
		return admDate;
	}

	public void setAdmDate(LocalDate admDate) {
		this.admDate = admDate;
	}

	public LocalDate getDisDate() {
		return disDate;
	}

	public void setDisDate(LocalDate disDate) {
		this.disDate = disDate;
	}

	public Hospital getHospId() {
		return hospId;
	}

	public void setHospId(Hospital hospId) {
		this.hospId = hospId;
	}

	

	public Patient(String firstName, String lastName, String email, double fees, LocalDate admDate, LocalDate disDate,
			String disease, Hospital hospId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.fees = fees;
		this.admDate = admDate;
		this.disDate = disDate;
		this.disease = disease;
		this.hospId = hospId;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", fees=" + fees
				+ ", admDate=" + admDate + ", disDate=" + disDate + ", disease=" + disease + ", hospId=" + hospId + "]";
	}

	
	

	
}
