package com.java.inkathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.inkathon.model.IncidentDo;
@Service
public interface IncidentService {
	
	public String saveIncident(IncidentDo incident) ;
	
	public List<IncidentDo> listIncidents();
	
	public String updateRisk(IncidentDo incident);

}

