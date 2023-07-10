package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.app.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class WebSeriesDTO {

	@NotBlank(message="movie name cannot be blank")
	private String movieName;
	@NotBlank(message="category cannot be blank")
	private String categories;
	@Future(message="it must be future date")
	private LocalDate releaseDate;
	@Positive(message="budget should be positive")
	private double budget;
	private String director;
	private LocalDate updatedReleaseDate;

	

	

	

	

	
}
