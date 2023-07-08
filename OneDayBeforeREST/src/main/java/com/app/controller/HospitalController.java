package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.APIResponse;
import com.app.dto.HospitalDTO;
import com.app.entity.Hospital;
import com.app.service.HospitalService;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
	
	@Autowired
	private HospitalService hospSer;
	
	@GetMapping
	List<Hospital> getAllHospitalDetails()
	{
		return hospSer.getHospital();
	}
	
	@PostMapping
	public APIResponse insertHospitalDetails(@RequestBody HospitalDTO hosp)
	{
		return new APIResponse(hospSer.addhospital(hosp));
	}

}
