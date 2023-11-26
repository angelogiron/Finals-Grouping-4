package com.it1311l.uap.oneflightapp.model;

public class Account 
{
	private long accountId;
	private String accountName;
	private String accountBirthday;
	private long accountPhoneNumber;
	private long accountPassportDetails;
	private String accountEmail;
	private String accountPassword;
	
	public long getAccountId() 
	{
		return accountId;
	}
	
	public void setAccountId(long accountId) 
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
	
	public long getAccountPhoneNumebr() 
	{
		return accountPhoneNumber;
	}
	
	public void setAccountPhoneNumebr(long accountPhoneNumebr) 
	{
		this.accountPhoneNumber = accountPhoneNumebr;
	}
	public long getAccountPasswordDetails() 
	{
		return accountPassportDetails;
	}
	
	public void setAccountPasswordDetails(long accountPasswordDetails) 
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

