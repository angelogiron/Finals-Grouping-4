package com.it1311l.uap.oneflightapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;
import com.it1311l.uap.oneflightapp.webclient.AmadeusApiClient;

@Service
public class AmadeusService {

	@Autowired
	AirlinesRepository airlinesRepo;
	
	@Autowired
	AmadeusApiClient amadeusApi;
	
	public AmadeusAirlineResponse airlineLoc(String airlineCode) {
		AmadeusAirlineResponse response = amadeusApi.getAirlineLocations(airlineCode);
		airlinesRepo.insertAirlineLoc(airlineCode, response.getName(), response.getIataCode());
		return response;
	}
}
