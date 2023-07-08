package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.PatientDTO;
import com.app.entity.Hospital;
import com.app.entity.Patient;
import com.app.exception.PatientNotFoundException;
import com.app.repository.HospitalRepository;
import com.app.repository.PatientRepository;
@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patRepo;
	@Autowired
	private HospitalRepository hosRepo;
//	@Autowired
//	private PatientService patSer;
	@Autowired
	private ModelMapper mp;
	@Override
	public List<Patient> getPatient() {
		// TODO Auto-generated method stub
		return patRepo.findAll();
	}
	@Override
	public PatientDTO addPatient(PatientDTO pat) {
		
		Hospital hosp=hosRepo.findById(pat.getHospId()).orElseThrow(()-> new PatientNotFoundException("patient not found"));
		Patient pat1=mp.map(pat, Patient.class);
		hosp.addPatients(pat1);
		Patient pat2=patRepo.saveAndFlush(pat1);
		PatientDTO p=mp.map(pat2, PatientDTO.class);
		p.setHospId(hosp.getId());
		
		return p;
	}

}
