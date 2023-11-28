package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.service.AmadeusService;

@RestController
public class airlineSyncController {

	@Autowired
	AmadeusService amadeusService;
	
	@PostMapping("/admin/airlines/sync")
	public AmadeusAirlineResponse syncAirlines(@RequestBody String iataCode) {
		return amadeusService.airlineLoc(iataCode);
	}
}
