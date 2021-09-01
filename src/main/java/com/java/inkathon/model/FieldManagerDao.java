package com.java.inkathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Field Manager")
public class FieldManagerDao {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long manager_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone_number")
	private String phoneNumber;

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public FieldManagerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FieldManagerDao [manager_id=" + manager_id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
