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

	@GetMapping("/admin/airlines/sync")
	public AmadeusAirlineResponse syncAirlines(@RequestBody String airlineCode) {
		return amadeusService.airlineLoc(airlineCode);

	}
}
