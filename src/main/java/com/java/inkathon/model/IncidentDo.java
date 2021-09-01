package com.java.inkathon.model;


import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Incident")
public class IncidentDo{
 // access specifier public
    @Id
    @Column(name="INCIDENT_ID")
    int id;
 
    @Column(name="MANAGER_ID")
    String managerID; 
 
    @Column(name="ACTION_NEEDED")
    String action;
    
    @Column(name="STATUS")
    String status;
    
    @Column(name="PHOTO")
    Blob photo;
    
    @Column(name="LOCATION")
    String location;
    
    @Column(name="DESCRIPTION")
    String description;
    
    @Column(name="INCIDENT_TYPE")
    String incidentType;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="INCIDENT_DATE")
    Date incidentDate;
    
    @Column(name="RISK_LEVEL")
    int riskLevel;
    
    public IncidentDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManagerName() {
		return managerID;
	}

	public void setManagerName(String managerName) {
		this.managerID = managerName;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public Blob getPhoto() {
//		return photo;
//	}

//	public void setPhoto(Blob photo) {
//		this.photo = photo;
//	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIncidentType() {
		return incidentType;
	}

	public void setIncidentType(String incidentType) {
		this.incidentType = incidentType;
	}

//	public Date getIncidentDate() {
//		return incidentDate;
//	}

//	public void setIncidentDate(Date incidentDate) {
//		this.incidentDate = incidentDate;
//	}

	public int getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}

	@Override
	public String toString() {
		return "Incident [id=" + id + ", managerID=" + managerID + ", action=" + action + ", status=" + status
				+ ", photo=" + photo + ", location=" + location + ", description=" + description + ", incidentType="
				+ incidentType + ", incidentDate=" + incidentDate + ", riskLevel=" + riskLevel + "]";
	}
	
           
}
    
    