package com.it1311l.uap.oneflightapp.model;

import java.util.List;

public class Iteneraries {
	private String duration;
	private List<Segments> segments;
	private Price price;
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<Segments> getSegments() {
		return segments;
	}
	public void setSegments(List<Segments> segments) {
		this.segments = segments;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	
	
}
