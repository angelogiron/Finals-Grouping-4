package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;
import com.it1311l.uap.oneflightapp.service.AmadeusService;

@RestController
public class AirlineSyncController 
{

	@Autowired
	AmadeusService amadeusService;
	
	@Autowired
	AirlinesRepository delete;

	@GetMapping("/admin/airlines/sync/{airlineCode}")
	public AmadeusAirlineResponse syncAirlines(@PathVariable String airlineCode) {
		return amadeusService.airlineLoc(airlineCode);

	}
	
	@GetMapping("/admin/airlines/delete")
	public void deleteAirlines() {
		delete.truncateAirlineLocations();
	}
	
}
