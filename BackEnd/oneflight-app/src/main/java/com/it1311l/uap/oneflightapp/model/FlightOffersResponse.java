package com.it1311l.uap.oneflightapp.model;

import java.util.ArrayList;

public class FlightOffersResponse 
{
	private ArrayList<FlightOffers> data= new ArrayList<FlightOffers>();
	
	public ArrayList<FlightOffers> getData() {
		return data;
	}
	
	public void setData(ArrayList<FlightOffers> data) {
		this.data = data;
	}
	
	public void setDetails(ArrayList<FlightOffers> data) {
		data.add(new FlightOffers());
	}
}
