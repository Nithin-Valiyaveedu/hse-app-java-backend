package com.java.inkathon.model;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java.inkathon.service.IncidentService;

@Entity
@Table(name="Incident")
public class IncidentDo{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="INCIDENT_ID")
    private int id;
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "MANAGER_ID", referencedColumnName = "MID")
	@Column(name="MANAGER_ID")
	private int ManagerID;
  
	@Column(name="STATUS")
    private String status;
    
    @Column(name="PHOTO")
    private Blob photo;
    
    @Column(name="LOCATION")
    private String location;
    
    @Column(name="DESCRIPTION")
    private String description;

	@Column(name="INCIDENT_TYPE")
    private String incidentType;
    
    @Column(name="INJURY")
    private String injury;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="INCIDENT_DATE")
    private java.sql.Date incidentDate;
    
    @Column(name="RISK_LEVEL")
    private int riskLevel;
    
    
    @Column(name="ACTION_NEEDED")
    private String action;
    
    @Column(name="SECTOR")
    private String sector;
  
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

	public java.sql.Date getIncidentDate() {
		return incidentDate;
	}

    public void setIncidentDate(java.sql.Date incidentDate) {
    	this.incidentDate = incidentDate;
	
    }

	public int getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}
	
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
	
	
	public int getManagerID() {
			return ManagerID;
	}

	public void setManagerID(int managerID) {
			ManagerID = managerID;
	}

	
	
	
	public IncidentDo() {
		super();
		// TODO Auto-generated constructor stub
//		setStatus("Processing");
//		setManagerID(101);
		
		
	}

	@Override
	public String toString() {
		return "IncidentDo [id=" + id + ", ManagerID=" + ManagerID + ", status=" + status + ", photo=" + photo
				+ ", location=" + location + ", description=" + description + ", incidentType=" + incidentType
				+ ", injury=" + injury + ", incidentDate=" + incidentDate + ", riskLevel=" + riskLevel + ", action="
				+ action + ", sector=" + sector + "]";
	}


	
	


	

	
           
}