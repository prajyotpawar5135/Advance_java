package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

public class UpdateDTO {
	
	@Future(message="date must be future")
	private LocalDate updatedReleaseDate;

	@NotBlank(message="series id cannot be null")
	private Long SerId;

	public LocalDate getUpdatedReleaseDate() {
		return updatedReleaseDate;
	}

	public void setUpdatedReleaseDate(LocalDate updatedReleaseDate) {
		this.updatedReleaseDate = updatedReleaseDate;
	}

	public Long getSerId() {
		return SerId;
	}

	public void setSerId(Long serId) {
		SerId = serId;
	}
	
	
	
	
	

}
