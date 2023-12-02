package com.it1311l.uap.oneflightapp.model;

import java.util.ArrayList;
import java.util.List;

public class AmadeusAirlineResponse {
	
	private List<AirlineDetails> data= new ArrayList<AirlineDetails>();
	
	public List<AirlineDetails> getData() {
		return data;
	}
	
	public void setData(List<AirlineDetails> data) {
		this.data = data;
	}
	
	public void setDetails(List<AirlineDetails> data) {
		data.add(new AirlineDetails());
	}
	
}
