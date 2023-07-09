package com.app.service;

import java.util.List;

import com.app.dto.RailwayDTO;
import com.app.entities.Railway;

public interface RailwayService {

	
	List<Railway> getAllRailway();
	
	String addRailway (RailwayDTO rail);
}

