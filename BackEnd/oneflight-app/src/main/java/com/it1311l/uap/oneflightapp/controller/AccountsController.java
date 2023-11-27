package com.it1311l.uap.oneflightapp.controller;
import com.it1311l.uap.oneflightapp.repository.AccountsRepository;
import com.it1311l.uap.oneflightapp.model.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	    String email = loginRequest.getAccountEmail();
	    String password = loginRequest.getAccountPassword();

	    Account storedAccount = accountsRepository.findByEmail(email);
	    
	    
	    if (storedAccount != null && password.equals(storedAccount.getAccountPassword())) {
	        return "Login successful!";
	    } else {
	        return "Login failed. Invalid email or password.";
	    }
	}
}
