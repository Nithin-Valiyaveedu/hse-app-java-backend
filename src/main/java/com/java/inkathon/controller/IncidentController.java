package com.java.inkathon.controller;
import com.java.inkathon.model.IncidentDo;
import com.java.inkathon.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(value="/Inkathon", produces="application/json")
public class IncidentController {
	
	@Autowired
	private IncidentService incidentService;
	@RequestMapping(value="/saveIncident", method= RequestMethod.POST)
	@ResponseBody 
	public String save(@RequestBody IncidentDo incident){
		return incidentService.saveIncident(incident);
	}
	
}
