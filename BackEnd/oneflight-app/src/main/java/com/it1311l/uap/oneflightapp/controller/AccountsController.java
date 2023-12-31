package com.it1311l.uap.oneflightapp.controller;
import com.it1311l.uap.oneflightapp.repository.AccountsRepository;
import com.it1311l.uap.oneflightapp.model.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController 
{
	@Autowired
	AccountsRepository accountsRepository;
	
	@PostMapping("/signup")
	public Account register(@RequestBody Account account)
	{
		accountsRepository.insert(account);
		return account;
	}

	@PostMapping("/login")
	public String login(@RequestBody Account loginRequest) {
	    Account storedAccount = accountsRepository.findByEmail(loginRequest.getAccountEmail());

	    if (storedAccount != null && storedAccount.getAccountPassword().equals(loginRequest.getAccountPassword())) 
	    { 
	        return storedAccount.getRole();
	    }
	    else 
	    {       
	        return "Invalid";
	    }
	}

}
