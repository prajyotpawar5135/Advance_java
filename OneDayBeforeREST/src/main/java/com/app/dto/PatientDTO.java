package com.app.dto;

import java.time.LocalDate;

public class PatientDTO {

	private String firstName;
	private String lastName;
	private String email;
	private double fees;
	private LocalDate admDate;
	private LocalDate disDate;
	private String disease;
    private Long hospId;
    
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Long getHospId() {
		return hospId;
	}
	public void setHospId(Long hospId) {
		this.hospId = hospId;
	}
	public PatientDTO(String firstName, String lastName, String email, double fees, LocalDate admDate,
			LocalDate disDate, String disease, Long hospId) {
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
	public PatientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", fees=" + fees
				+ ", admDate=" + admDate + ", disDate=" + disDate + ", disease=" + disease + ", hospId=" + hospId + "]";
	}
    
    

}
