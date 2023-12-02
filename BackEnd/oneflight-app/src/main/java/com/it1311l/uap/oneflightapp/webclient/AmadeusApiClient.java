package com.it1311l.uap.oneflightapp.webclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;
import com.it1311l.uap.oneflightapp.model.FlightOffersResponse;

@HttpExchange
public interface AmadeusApiClient {

	@GetExchange("airline/destinations?airlineCode={airlineCode}")
	public AmadeusAirlineResponse getAirlineLocations(@PathVariable String airlineCode);
	
	@GetExchange("/shopping/flight-offers?originLocationCode={originLocationCode}"
			+ "&destinationLocationCode={destinationLocationCode}"
			+ "&departureDate={departureDate}"
			+ "&returnDate={returnDate}}"
			+ "&adults={adults}"
			+ "&nonStop={nonStop}")
	public FlightOffersResponse getFlightOffers(@PathVariable String originLocationCode, @PathVariable String destinationLocationCode, @PathVariable String departureDate, @PathVariable String returnDate, @PathVariable int adults, @PathVariable int nonStop);
}
