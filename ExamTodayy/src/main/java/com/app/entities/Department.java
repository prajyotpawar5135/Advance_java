package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Depart")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department extends BaseEntity {

	@Column(length=30)
	private String deptName;
	
	@Column(length=30)
	private String location;
											//mhanje parent madhe jo change krel to same chind madhe zala pahije
	@OneToMany(mappedBy = "assignedDept",cascade=CascadeType.ALL,orphanRemoval = true)
	 private  List<Employee>emplist=new ArrayList<>();
	
}
