package com.it1311l.uap.oneflightapp.model;

import java.util.ArrayList;
import java.util.List;

public class AmadeusAirlineResponse {
	
	private ArrayList<AirlineDetails> data= new ArrayList<AirlineDetails>();
	
	public ArrayList<AirlineDetails> getData() {
		return data;
	}
	
	public void setData(ArrayList<AirlineDetails> data) {
		this.data = data;
	}
	
	public void setDetails(ArrayList<AirlineDetails> data) {
		data.add(new AirlineDetails());
	}
	
}
