package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="hospital")
@JsonIgnoreType
public class Hospital extends BaseEntity{
///name,location
	
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "hospId",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	List<Patient> patList=new ArrayList<>();

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Patient> getPatList() {
		return patList;
	}

	public void setPatList(List<Patient> patList) {
		this.patList = patList;
	}
	
	
	

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String name, String location, List<Patient> patList) {
		super();
		this.name = name;
		this.location = location;
		this.patList = patList;
	}
	
	
	

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", patList=" + patList + "]";
	}

	public boolean addPatients(Patient p)
	{
		patList.add(p);
		p.setHospId(this);
		return true;
	}
	
	public boolean deletePatient(Patient p)
	{
		patList.remove(p);
		p.setId(null);
		return true;
	}
	
	
}
