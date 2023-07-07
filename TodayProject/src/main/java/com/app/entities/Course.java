package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")

public class Course extends BaseEntity{

	@Column(length=30)
   private String title;
	@Column(length=30)
   private String startDate;

   private String endDate;
	
   private double fees;
   private double score;
   
   @OneToMany(mappedBy = "Assignedcourse",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Student> studList= new ArrayList<>();

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

public List<Student> getStudList() {
	return studList;
}

public void setStudList(List<Student> studList) {
	this.studList = studList;
}

public Course(String title, String startDate, String endDate, double fees, double score, List<Student> studList) {
	super();
	this.title = title;
	this.startDate = startDate;
	this.endDate = endDate;
	this.fees = fees;
	this.score = score;
	this.studList = studList;
}



public Course() {
	super();
	// TODO Auto-generated constructor stub
}
   
@Override
public String toString() {
	return "Course [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees
			+ ", score=" + score + ", studList=" + studList + "]";
}
   
   
   public boolean addStudent (Student s )
   {
	 studList.add(s);
	 s.setAssignedcourse(this);
	 return true;
   }
   
   public boolean removeStudent(Student s)
   {
	   studList.remove(s);
	   s.setAssignedcourse(null);
	   return true;
   }

   
   
   
}
