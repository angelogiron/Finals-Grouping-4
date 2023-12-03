package com.it1311l.uap.oneflightapp.model;


public class FlightOffers 
{
	private String source;
	private boolean oneWay;
	private int numberOfBookableSeats;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public boolean isOneWay() {
		return oneWay;
	}
	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}
	public int getNumberOfBookableSeats() {
		return numberOfBookableSeats;
	}
	public void setNumberOfBookableSeats(int numberOfBookableSeats) {
		this.numberOfBookableSeats = numberOfBookableSeats;
	}
	
}
