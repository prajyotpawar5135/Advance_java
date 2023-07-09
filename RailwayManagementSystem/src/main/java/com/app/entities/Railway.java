package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@JsonIgnoreType
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="pList")
public class Railway extends BaseEntity{

	@Column(length=30)
	private String railwayName;
	
	@OneToMany(mappedBy = "railId",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	List<Passenger> pList=new ArrayList<Passenger>();
	
	public boolean addPassenger(Passenger p)
	{
		pList.add(p);
	    p.setRailId(this);
		return true;
	}
	
	public boolean deletePassenger(Passenger pa)
	{
		pList.remove(pa);
		pa.setRailId(null);
		return true;
	}
}










