package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UpdateDTO;
import com.app.dto.WebSeriesDTO;
import com.app.entities.WebSeries;
import com.app.service.WebSeriesService;

@RestController
@RequestMapping("/webseries")
public class WebSeriesController {

	@Autowired
	private WebSeriesService webSer;
	
	
@GetMapping
public List<WebSeries> getAllWeBSeriesDetails()
{
	return webSer.getWebSeries();
}

@PostMapping
public ResponseEntity<?> insertWebService( @RequestBody @Valid WebSeriesDTO ws)
{
	return ResponseEntity.status(HttpStatus.CREATED).body(webSer.addWebSeries(ws));
}

@PutMapping("/update")
public ResponseEntity<?> put(@RequestBody UpdateDTO upt)
{
	return ResponseEntity.status(HttpStatus.OK).body(webSer.updateWebSeries(upt));
	}


@DeleteMapping("/{sid}")
public ResponseEntity<?> delete(@RequestBody Long serId)
{
	return ResponseEntity.status(HttpStatus.OK).body(webSer.delete(serId));
	}



	
}
