package com.it1311l.uap.oneflightapp.model;

public class Account 
{
	private String accountName;
	private String accountBirthday;
	private int accountPhoneNumber;
	private int accountPassportDetails;
	private String accountEmail;
	private String accountPassword;
	private String role;
		
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setAccountPhoneNumber(int accountPhoneNumber) {
		this.accountPhoneNumber = accountPhoneNumber;
	}

	public void setAccountPassportDetails(int accountPassportDetails) {
		this.accountPassportDetails = accountPassportDetails;
	}

	public String getAccountName() 
	{
		return accountName;
	}
	
	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}
	
	public String getAccountBirthday() 
	{
		return accountBirthday;
	}
	
	public void setAccountBirthday(String accountBirthday) 
	{
		this.accountBirthday = accountBirthday;
	}
	
	public int getAccountPhoneNumber() 
	{
		return accountPhoneNumber;
	}
	
	public void setAccountPhoneNumebr(int accountPhoneNumber) 
	{
		this.accountPhoneNumber = accountPhoneNumber;
	}
	public long getAccountPassportDetails() 
	{
		return accountPassportDetails;
	}
	
	public void setAccountPasswordDetails(int accountPassportDetails) 
	{
		this.accountPassportDetails = accountPassportDetails;
	}
	
	public String getAccountEmail() 
	{
		return accountEmail;
	}
	
	public void setAccountEmail(String accountEmail) 
	{
		this.accountEmail = accountEmail;
	}
	
	public String getAccountPassword() 
	{
		return accountPassword;
	}
	
	public void setAccountPassword(String accountPassword) 
	{
		this.accountPassword = accountPassword;
	}
}

