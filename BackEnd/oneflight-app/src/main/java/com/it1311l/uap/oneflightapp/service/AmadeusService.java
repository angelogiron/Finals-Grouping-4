package com.it1311l.uap.oneflightapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.it1311l.uap.oneflightapp.model.AirlineDetails;
import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.model.FlightOffers;
import com.it1311l.uap.oneflightapp.model.FlightOffersRequest;
import com.it1311l.uap.oneflightapp.model.FlightOffersResponse;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;
import com.it1311l.uap.oneflightapp.repository.FlightOffersRepository;
import com.it1311l.uap.oneflightapp.webclient.AmadeusApiClient;

@Service
public class AmadeusService {

	@Autowired
	AirlinesRepository airlinesRepo;
	/*
	@Autowired
	FlightOffersRepository flightsRepo;
	*/
	@Autowired
	AmadeusApiClient amadeusApi;
	
	public AmadeusAirlineResponse airlineLoc(String airlineCode) 
	{
		AmadeusAirlineResponse response = amadeusApi.getAirlineLocations(airlineCode);
		ArrayList<AirlineDetails> heyyy = response.getData();

		for (AirlineDetails details : heyyy) 
		{
            airlinesRepo.insertAirlineLoc(airlineCode, details.getName(), details.getIataCode());
        }	
		return response;
	}
	
	public FlightOffersResponse flightOffers(String originLocationCode, String destinationLocation, String departureDate, String arrivalDate, int passengerCounts, String airlineCode) {
		FlightOffersResponse response = amadeusApi.getFlightOffers(originLocationCode, destinationLocation, departureDate, arrivalDate, passengerCounts, airlineCode);
		return response;
	}
}
