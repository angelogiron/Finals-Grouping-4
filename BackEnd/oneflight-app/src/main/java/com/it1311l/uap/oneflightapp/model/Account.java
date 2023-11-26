package com.it1311l.uap.oneflightapp.model;

public class Account 
{
	private int accountId;
	private String accountName;
	private String accountBirthday;
	private int accountPhoneNumber;
	private int accountPassportDetails;
	private String accountEmail;
	private String accountPassword;
	
	public int getAccountId() 
	{
		return accountId;
	}
	
	public void setAccountId(int accountId) 
	{
		this.accountId = accountId;
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
	
	public int getAccountPhoneNumebr() 
	{
		return accountPhoneNumber;
	}
	
	public void setAccountPhoneNumebr(int accountPhoneNumebr) 
	{
		this.accountPhoneNumber = accountPhoneNumebr;
	}
	public int getAccountPasswordDetails() 
	{
		return accountPassportDetails;
	}
	
	public void setAccountPasswordDetails(int accountPasswordDetails) 
	{
		this.accountPassportDetails = accountPasswordDetails;
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

