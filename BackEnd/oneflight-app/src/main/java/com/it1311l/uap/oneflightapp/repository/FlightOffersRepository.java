package com.it1311l.uap.oneflightapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.it1311l.uap.oneflightapp.model.FlightOffers;

public interface FlightOffersRepository 
{
	@Insert("INSERT INTO flight_booking(queuing_office_id, "
			+ "creation_date, origin_location_code, "
			+ "round_trip_tag, number_of_passengers, "
			+ "reference_number, flight_offer_id, "
			+ "total_charged_amount) VALUES (#{queuing_office_id}, "
			+ "#{creation_date}, #{origin_location_code}, "
			+ "#{round_trip_tag}, #{number_of_passengers}, "
			+ "#{reference_number}, #{flight_offer_id}, "
			+ "#{total_charged_amount})")
	public int insertAirlineLoc(int queuing_office_id, String creation_date, String origin_location_code, String destination_location_code, int round_trip_tag, int number_of_passengers, int reference_number, int flight_offer_id, int total_charged_amount);
	
	@Select("SELECT * FROM flight_booking")
	public List<FlightOffers> getFlightOffers();
}
