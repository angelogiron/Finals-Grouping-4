package com.it1311l.uap.oneflightapp.webclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;

@HttpExchange
public interface AmadeusApiClient {

<<<<<<< HEAD
	@GetExchange("airline/destinations?airlineCode={airlineCode}&max=1")
=======
	@GetExchange("airline/destinations?airlineCode=BA&max=1")
>>>>>>> 1b1a99a8c1f748a3a7504f73e28088ba6cf7763c
	public AmadeusAirlineResponse getAirlineLocations(@PathVariable String airlineCode);
}
