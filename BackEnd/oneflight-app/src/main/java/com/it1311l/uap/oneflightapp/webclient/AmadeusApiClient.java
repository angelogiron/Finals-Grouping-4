package com.it1311l.uap.oneflightapp.webclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;

@HttpExchange
public interface AmadeusApiClient {

	@GetExchange("airline/destinations?airlineCode=#{airlineCode}")
	public AmadeusAirlineResponse getAirlineLocations(@PathVariable String airlineCode);
	
}
