package com.java.inkathon.controller;
import com.java.inkathon.dto.ResponseDto;
import com.java.inkathon.model.IncidentDo;
import com.java.inkathon.service.IncidentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	ResponseDto rdto = new ResponseDto();
	
	//Post request
	
	@RequestMapping(value="/saveIncident", method= RequestMethod.POST)
	@ResponseBody 
	public String save(@RequestBody IncidentDo incident){
		return incidentService.saveIncident(incident);
	}
	
	//Getting all incident
	
	@GetMapping("/test1")
	@ResponseBody
	public ResponseDto methodTest() {

		List<IncidentDo> rsE = incidentService.listIncidents();
		System.err.println("data " + rsE);
		rdto.setData(rsE);
		return rdto;
	}
	
	@GetMapping("/test2")
	@ResponseBody
	public Object methodTest1() {

		List<IncidentDo> rsE = incidentService.listIncidents();
		return rsE;
	}
	
	@RequestMapping(value="/updateRisk", method= RequestMethod.POST)
	@ResponseBody
	public String updaterisk(@RequestBody IncidentDo incident){
		return incidentService.updateRisk(incident);
	}
	
	//Approving an incident
	
	@RequestMapping(value="/approve", method= RequestMethod.POST)
	@ResponseBody 
	public String updatestatus(@RequestBody IncidentDo incident){
		return incidentService.updateStatus(incident);
	}
	
	//Rejecting a status 
	
	@RequestMapping(value="/reject", method= RequestMethod.POST)
	@ResponseBody 
	public String rejectstatus(@RequestBody IncidentDo incident){
		return incidentService.rejectStatus(incident);
	}
	
	
	//Deleting an incident
	@DeleteMapping("/incident/{id}") 
	public String deleteUser(@PathVariable int id) throws Exception{ 
		return incidentService.deleteById(id);  
	}
	
	
	
	
}
