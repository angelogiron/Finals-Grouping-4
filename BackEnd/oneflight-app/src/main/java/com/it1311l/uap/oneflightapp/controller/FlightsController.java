package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.it1311l.uap.oneflightapp.model.Account;
import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.model.FlightOffers;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;
import com.it1311l.uap.oneflightapp.repository.FlightOffersRepository;

@RestController
public class FlightsController {

    @Autowired
    private AirlinesRepository amadeusService;
    
    @Autowired
    private FlightOffersRepository access;
    
    @GetMapping("/flight-offers")
    public List<FlightOffers> getFlightOffers(
    		@PathVariable int travelType,
    		@PathVariable String airlineCode,
            @PathVariable String originLocation,
            @PathVariable String destinationLocation,
            @PathVariable String departureDate,
            @PathVariable String arrivalDate,
            @PathVariable int passengerCount
            ) {
				return access.getFlightOffers(); 
   
    }

    @GetMapping("/airlineCodes")
    public List<AmadeusAirlineResponse> getAvailableAirlineCodes() {
        return amadeusService.getAllAirlineCodes();
    }

    @GetMapping("/locations")
    public List<AmadeusAirlineResponse> getAvailableLocations() {
        return amadeusService.getAllLocations();
    }
}
