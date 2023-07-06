package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="emplo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="password")
public class Employee extends BaseEntity{
	
	
	private String firstName;
	
	private String lastName;
	
	@Column(length=30)
	private String email;
	
	private String Password;
	private String dob;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dept_id")
	private Department assignedDept;
	

	
	
}
