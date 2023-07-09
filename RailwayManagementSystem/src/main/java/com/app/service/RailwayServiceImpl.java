package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.RailwayDTO;
import com.app.entities.Railway;
import com.app.exceptions.RailwayNotFoundException;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService{

	@Autowired
	private RailwayRepository railRepo;
	
	@Autowired
	private ModelMapper mp;
	@Override
	public List<Railway> getAllRailway() {
		// TODO Auto-generated method stub
		return railRepo.findAll();
	}
	@Override
	public String addRailway(RailwayDTO rail) {
		
	Railway r=mp.map(rail, Railway.class)	;
	Railway railway=railRepo.save(r);
		
	if(railway==null)
	    throw new RailwayNotFoundException("railway not found");
		return "Railway Details Added";
	}

	
	
	
	
	
	
	
}
