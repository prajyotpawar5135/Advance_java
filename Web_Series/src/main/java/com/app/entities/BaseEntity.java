package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long SerId;

	public Long getSerId() {
		return SerId;
	}

	public void setSerId(Long serId) {
		SerId = serId;
	}
	
	
}
