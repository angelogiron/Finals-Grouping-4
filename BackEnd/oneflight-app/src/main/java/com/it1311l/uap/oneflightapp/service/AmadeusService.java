package com.it1311l.uap.oneflightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it1311l.uap.oneflightapp.model.AirlineDetails;
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
		/*
		List<AirlineDetails> heyyy = response.getData();
		AirlineDetails details = heyyy.get(0);
		
		airlinesRepo.insertAirlineLoc(airlineCode, details.getName(), details.getIataCode());
		*/
		return response;
	}
}
