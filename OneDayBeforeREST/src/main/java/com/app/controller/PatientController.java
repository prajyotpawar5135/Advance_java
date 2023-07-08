package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.APIResponse;
import com.app.dto.PatientDTO;
import com.app.entity.Patient;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	private PatientService patSer;

	@GetMapping
	List<Patient> getPatientDetails()
	{
		return patSer.getPatient();
	}
	
	@PostMapping
	public ResponseEntity<?> insertPatient(@RequestBody PatientDTO pat)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(patSer.addPatient(pat));
	}
}
