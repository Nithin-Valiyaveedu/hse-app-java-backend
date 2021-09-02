package com.java.inkathon.model;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Incident")
public class IncidentDo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="INCIDENT_ID")
    private int id;
 
    @Column(name="MANAGER_ID")
    private int managerID; 
    
    @Column(name="STATUS")
    private String status;
    
    @Column(name="PHOTO")
    private Blob photo;
    
    @Column(name="LOCATION")
    private String location;
    
    @Column(name="DESCRIPTION")
    private String description;
    
    public String getInjury() {
		return injury;
	}

	public void setInjury(String injury) {
		this.injury = injury;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Column(name="INCIDENT_TYPE")
    private String incidentType;
    
    @Column(name="INJURY")
    private String injury;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="INCIDENT_DATE")
    private Date incidentDate;
    
    @Column(name="RISK_LEVEL")
    private int riskLevel;
    
    
    @Column(name="ACTION_NEEDED")
    private String action;
    
    @Column(name="SECTOR")
    private String sector;
    
    
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
    
    