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

import com.app.dto.RailwayDTO;
import com.app.entities.Railway;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController {

	@Autowired
	private RailwayService railSer;
	
	@GetMapping
	public List<Railway> getAllRailDetails()
	{
		return railSer.getAllRailway();
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertRailway( @RequestBody RailwayDTO r)
	{
		return ResponseEntity.status(HttpStatus.OK).body(railSer.addRailway(r));
	}
}
