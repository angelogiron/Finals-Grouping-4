package com.it1311l.uap.oneflightapp.model;

public class Segments {
	private Departure departure;
	private Arrival arrival;
	private String carrierCode;
	private int number;
	private Aircraft aircraft;
	private Operating operating;
	private int id;
	private int numberOfStops;
	
	
	public Departure getDeparture() {
		return departure;
	}
	public void setDeparture(Departure departure) {
		this.departure = departure;
	}
	public Arrival getArrival() {
		return arrival;
	}
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Aircraft getAircraft() {
		return aircraft;
	}
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	public Operating getOperating() {
		return operating;
	}
	public void setOperating(Operating operating) {
		this.operating = operating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfStops() {
		return numberOfStops;
	}
	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	
	
}
