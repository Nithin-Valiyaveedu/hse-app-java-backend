package com.java.inkathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.inkathon.model.Incident;
@Service
public interface IncidentService {
	
	public String saveIncident(Incident incident) ;
	
	public List<Incident> getallincident();

}

