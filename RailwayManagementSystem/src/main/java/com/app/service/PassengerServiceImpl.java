package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.PassengerDTO;
import com.app.entities.Passenger;
import com.app.entities.Railway;
import com.app.repository.PassengerRepository;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passRepo;
	
	@Autowired
	private RailwayRepository railRepo;
	
	@Autowired
	private ModelMapper mp;
	@Override
	public List<Passenger> getAllPass() {
		// TODO Auto-generated method stub
		return passRepo.findAll();
	}
	@Override
	public String addPassenger(PassengerDTO p) {
		Railway r=railRepo.findById(p.getRailId()).orElseThrow();
		Passenger pa=mp.map(p, Passenger.class);
		r.addPassenger(pa);
		passRepo.save(pa);

		return "passenger added successfully";
	}

	
	

}
