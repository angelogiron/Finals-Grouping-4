package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.service.AmadeusService;

@RestController
public class AirlineSyncController 
{

	@Autowired
	AmadeusService amadeusService;
<<<<<<< HEAD

	@GetMapping("/admin/airlines/sync")
	public AmadeusAirlineResponse syncAirlines(@RequestBody String airlineCode) {
		return amadeusService.airlineLoc(airlineCode);
=======
	
	@GetMapping("/admin/airlines/sync")
	public AmadeusAirlineResponse syncAirlines(@RequestBody String iataCode) 
	{
		return amadeusService.airlineLoc(iataCode);
>>>>>>> 1b1a99a8c1f748a3a7504f73e28088ba6cf7763c
	}
	
	// Try mo mag post din 
}
