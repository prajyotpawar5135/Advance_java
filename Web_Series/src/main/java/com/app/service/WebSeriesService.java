package com.app.service;

import java.util.List;

import com.app.dto.APIResponse;
import com.app.dto.UpdateDTO;
import com.app.dto.WebSeriesDTO;
import com.app.entities.WebSeries;

public interface WebSeriesService {

	List<WebSeries> getWebSeries();
	
	WebSeriesDTO addWebSeries(WebSeriesDTO ws);
	 
	WebSeriesDTO  updateWebSeries(UpdateDTO update);
	 
	APIResponse delete(Long serid);
}
