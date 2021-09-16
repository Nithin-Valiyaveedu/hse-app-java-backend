package com.java.inkathon.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.inkathon.model.IncidentDo;
@Service
public interface IncidentService {
	
	public String saveIncident(IncidentDo incident) ;
	
	public List<IncidentDo> listIncidents();
	
	public List<IncidentDo> sortrisklevel();
	
	public String updateRisk(IncidentDo incident);

	public String updateStatus(IncidentDo incident);
	
	public String rejectStatus(IncidentDo incident);
	
	public String deleteById(int id);
	
	public String saveComments(IncidentDo incident);
	

}

