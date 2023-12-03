package com.it1311l.uap.oneflightapp.webclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.model.FlightOffersRequest;
import com.it1311l.uap.oneflightapp.model.FlightOffersResponse;

@HttpExchange
public interface AmadeusApiClient {

	@GetExchange("v1/airline/destinations?airlineCode={airlineCode}")
	public AmadeusAirlineResponse getAirlineLocations(@PathVariable String airlineCode);
	
	@GetExchange("v2/shopping/flight-offers?originLocationCode={originLocationCode}"
			+ "&destinationLocationCode={destinationLocation}"
			+ "&departureDate={departureDate}"
			+ "&returnDate={arrivalDate}"
			+ "&adults={passengerCount}"
			+ "&includedAirlineCodes={airlineCode}"
			+ "&nonStop=true")
	public FlightOffersResponse getFlightOffers(@PathVariable String originLocationCode, @PathVariable String destinationLocation, @PathVariable String departureDate, @PathVariable String arrivalDate, @PathVariable int passengerCount, @PathVariable String airlineCode);
}
