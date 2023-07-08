package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.HospitalDTO;
import com.app.entity.Hospital;
import com.app.exception.PatientNotFoundException;
import com.app.repository.HospitalRepository;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {
	
	
	
	@Autowired
	private HospitalRepository hosRepo;
	@Autowired
	private ModelMapper mp;
	
	@Override
	public List<Hospital> getHospital() {
		// TODO Auto-generated method stub
		return hosRepo.findAll();
	}

	@Override
	public String addhospital(HospitalDTO ho) throws PatientNotFoundException {
		Hospital hosp=mp.map(ho, Hospital.class);
		Hospital hosp1=hosRepo.save(hosp);
		if(hosp1==null)
			throw new PatientNotFoundException("hospital insertion fail");
		return "hospital added successfully";
	}

}
