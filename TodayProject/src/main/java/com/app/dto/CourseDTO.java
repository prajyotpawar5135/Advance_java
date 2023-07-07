package com.app.dto;

public class CourseDTO {

	private String title;
	private String startDate;
	private String endDate;
	private double fees;
	private double score;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public CourseDTO(String title, String startDate, String endDate, double fees, double score) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.score = score;
	}
	public CourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CourseDTO [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees
				+ ", score=" + score + "]";
	}

	
	
	
}
