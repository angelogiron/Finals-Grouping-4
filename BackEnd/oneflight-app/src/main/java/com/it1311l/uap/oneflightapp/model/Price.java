package com.it1311l.uap.oneflightapp.model;

import java.util.ArrayList;
import java.util.List;

public class Price {
	private String currency;
	private float total;
	private float base;
	private List<Fees> fees = new ArrayList<Fees>();
	private float grandTotal;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public List<Fees> getFees() {
		return fees;
	}
	public void setFees(List<Fees> fees) {
		this.fees = fees;
	}
	public void addFees(List<Fees> fees) {
		fees.add(new Fees());
	}
	public float getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	
}
