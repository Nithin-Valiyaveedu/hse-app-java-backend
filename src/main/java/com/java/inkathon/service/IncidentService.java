package com.java.inkathon.service;

import org.springframework.stereotype.Service;

import com.java.inkathon.model.Incident;
@Service
public interface IncidentService {
	
	public String saveIncident(Incident incident) ;

}

