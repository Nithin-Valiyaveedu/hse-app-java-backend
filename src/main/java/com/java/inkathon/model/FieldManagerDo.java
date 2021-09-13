package com.java.inkathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FieldManager")
public class FieldManagerDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MID")
	private Long mid;
	
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	@Column(name="Manager_ID")
//	private Long manager_id;
	

	@Column(name="name")
	private String name;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@OneToOne(mappedBy="FieldManager")
	 private IncidentDo Incident;

	
//	public Long getManager_id() {
//		return manager_id;
//	}

//	public void setManager_id(Long manager_id) {
//		this.manager_id = manager_id;
//	}

	public IncidentDo getIncident() {
		return Incident;
	}

	public void setIncident(IncidentDo incident) {
		Incident = incident;
		
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

	public FieldManagerDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "FieldManagerDo [mid=" + mid + ", name=" + name + ", phoneNumber=" + phoneNumber + ", Incident="
				+ Incident + "]";
	}




	
	
}
