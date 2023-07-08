package com.app.service;

import java.util.List;

import com.app.dto.PatientDTO;
import com.app.entity.Patient;

public interface PatientService {

	
	List<Patient> getPatient();
	PatientDTO addPatient(PatientDTO pat);
}
