package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
@Entity
@JsonIgnoreType
@Table(name="webseries")
public class WebSeries extends BaseEntity{

	@Column(length=70,nullable = false)
	private String movieName;
	@Enumerated(EnumType.STRING)
	private Category categories;
	private LocalDate releaseDate;
	private double budget;
	private String director;
	private LocalDate updatedReleaseDate;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Category getCategories() {
		return categories;
	}
	public void setCategories(Category categories) {
		this.categories = categories;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public LocalDate getUpdatedReleaseDate() {
		return updatedReleaseDate;
	}
	public void setUpdatedReleaseDate(LocalDate updatedReleaseDate) {
		this.updatedReleaseDate = updatedReleaseDate;
	}
	public WebSeries(String movieName, Category categories, LocalDate releaseDate, double budget, String director,
			LocalDate updatedReleaseDate) {
		super();
		this.movieName = movieName;
		this.categories = categories;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.director = director;
		this.updatedReleaseDate = updatedReleaseDate;
	}
	public WebSeries() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WebSeries [movieName=" + movieName + ", categories=" + categories + ", releaseDate=" + releaseDate
				+ ", budget=" + budget + ", director=" + director + ", updatedReleaseDate=" + updatedReleaseDate + "]";
	}
	
	
	
	
	
	
	
}
