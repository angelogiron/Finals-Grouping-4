package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.it1311l.uap.oneflightapp.model.Account;
import com.it1311l.uap.oneflightapp.model.AirlineDetails;
import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.model.FlightOffers;
import com.it1311l.uap.oneflightapp.model.FlightOffersRequest;
import com.it1311l.uap.oneflightapp.model.FlightOffersResponse;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;
import com.it1311l.uap.oneflightapp.repository.FlightOffersRepository;
import com.it1311l.uap.oneflightapp.service.AmadeusService;

@RestController
public class FlightsController {

    @Autowired
    private AirlinesRepository amadeusService;
    
    @Autowired
    AmadeusService amadeusApi;
    
    @PostMapping("/flight-offers")
    public FlightOffersResponse getFlightOffers(@RequestBody FlightOffersRequest request) {
				return amadeusApi.flightOffers(request.getOriginLocation(), request.getDestinationLocation(), request.getDepartureDate(), request.getArrivalDate(), request.getPassengerCount(), request.getAirlineCode()); 
    }

    @GetMapping("/airlineCodes")
    public List<String> getAvailableAirlineCodes() {
        return amadeusService.getAllAirlineCodes();
    }

    @GetMapping("/locations")
    public List<String> getAvailableLocations() {
        return amadeusService.getAllLocations();
    }
}
