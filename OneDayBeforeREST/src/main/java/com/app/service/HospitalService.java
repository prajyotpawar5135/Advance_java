package com.app.service;

import java.util.List;

import com.app.dto.HospitalDTO;
import com.app.entity.Hospital;

public interface HospitalService {

	List<Hospital> getHospital();
	String addhospital(HospitalDTO ho);
	
}
