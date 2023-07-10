package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.WebSeriesRepository;
import com.app.dto.APIResponse;
import com.app.dto.UpdateDTO;
import com.app.dto.WebSeriesDTO;
import com.app.entities.WebSeries;

@Service
@Transactional
public class WebSeriesServiceImpl implements WebSeriesService{

	@Autowired
	private WebSeriesRepository webRepo;
	
	@Autowired
	private ModelMapper mp;
	
	@Override
	public List<WebSeries> getWebSeries() {
		// TODO Auto-generated method stub
		return webRepo.findAll();
	}

	@Override
	public WebSeriesDTO addWebSeries(WebSeriesDTO ws) {
		WebSeries series=mp.map(ws, WebSeries.class);
		WebSeries w=webRepo.save(series);
		return mp.map(w, WebSeriesDTO.class);
		
		//return webRepo.save(series);
	}

	@Override
	public WebSeriesDTO updateWebSeries(UpdateDTO up) {
		WebSeries wbs=webRepo.findById(up.getSerId()).orElseThrow();
		wbs.setUpdatedReleaseDate(up.getUpdatedReleaseDate());;
		WebSeries s1=webRepo.save(wbs);
		return mp.map(s1, WebSeriesDTO.class);
	}

	@Override
	public APIResponse delete(Long serid) {
		if(webRepo.existsById(serid))
		{
			webRepo.findById(serid);
			return new APIResponse("web series deletion successfull");
		}
		return new APIResponse("SEries deletion failed");
	}
	
	

	
	
	
	
	

}
