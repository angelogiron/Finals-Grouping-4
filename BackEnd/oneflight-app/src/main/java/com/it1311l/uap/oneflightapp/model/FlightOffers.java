package com.it1311l.uap.oneflightapp.model;

import java.util.ArrayList;
import java.util.List;

public class FlightOffers 
{
	private String source;
	private boolean oneWay;
	private String lastTicketingDate;
	private int numberOfBookableSeats;
	private List<Iteneraries> iteneraries = new ArrayList<Iteneraries>();
	
	public String getLastTicketingDate() {
		return lastTicketingDate;
	}
	public void setLastTicketingDate(String lastTicketingDate) {
		this.lastTicketingDate = lastTicketingDate;
	}
	public List<Iteneraries> getIteneraries() {
		return iteneraries;
	}
	public void setIteneraries(List<Iteneraries> iteneraries) {
		this.iteneraries = iteneraries;
	}
	public void addIteneraries(List<Iteneraries> iteneraries) {
		iteneraries.add(new Iteneraries());
	}
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
