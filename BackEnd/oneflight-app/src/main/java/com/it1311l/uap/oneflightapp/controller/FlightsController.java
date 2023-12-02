package com.it1311l.uap.oneflightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.it1311l.uap.oneflightapp.model.Account;
import com.it1311l.uap.oneflightapp.model.AirlineDetails;
import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.repository.AirlinesRepository;

@RestController
public class FlightsController {

    @Autowired
    private AirlinesRepository amadeusService;

    @GetMapping("/airlineCodes")
    public List<String> getAvailableAirlineCodes() {
        return amadeusService.getAllAirlineCodes();
    }

    @GetMapping("/locations")
    public List<String> getAvailableLocations() {
        return amadeusService.getAllLocations();
    }
}
