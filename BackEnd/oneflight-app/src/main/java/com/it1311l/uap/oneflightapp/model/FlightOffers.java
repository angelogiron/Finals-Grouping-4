package com.it1311l.uap.oneflightapp.model;


public class FlightOffers 
{
	private int id;
	private int queuing_office_id;
	private String creation_date;
	private String origin_location_code;
	private String destination_location_code;
	private int round_trip_tag;
	private int number_of_passengers;
	private int reference_number;
	private int flight_offer_id;
	private int total_charged_amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQueuing_office_id() {
		return queuing_office_id;
	}
	public void setQueuing_office_id(int queuing_office_id) {
		this.queuing_office_id = queuing_office_id;
	}
	public String getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
	public String getOrigin_location_code() {
		return origin_location_code;
	}
	public void setOrigin_location_code(String origin_location_code) {
		this.origin_location_code = origin_location_code;
	}
	public String getDestination_location_code() {
		return destination_location_code;
	}
	public void setDestination_location_code(String destination_location_code) {
		this.destination_location_code = destination_location_code;
	}
	public int getRound_trip_tag() {
		return round_trip_tag;
	}
	public void setRound_trip_tag(int round_trip_tag) {
		this.round_trip_tag = round_trip_tag;
	}
	public int getNumber_of_passengers() {
		return number_of_passengers;
	}
	public void setNumber_of_passengers(int number_of_passengers) {
		this.number_of_passengers = number_of_passengers;
	}
	public int getReference_number() {
		return reference_number;
	}
	public void setReference_number(int reference_number) {
		this.reference_number = reference_number;
	}
	public int getFlight_offer_id() {
		return flight_offer_id;
	}
	public void setFlight_offer_id(int flight_offer_id) {
		this.flight_offer_id = flight_offer_id;
	}
	public int getTotal_charged_amount() {
		return total_charged_amount;
	}
	public void setTotal_charged_amount(int total_charged_amount) {
		this.total_charged_amount = total_charged_amount;
	}
}
