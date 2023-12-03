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
	
	    Account storedAccount = accountsRepository.findByEmail(loginRequest.getAccountEmail());
	    
	    if (storedAccount != null && storedAccount.getAccountPassword().equals(loginRequest.getAccountPassword())) {
	        return storedAccount.getRole();
	    } 
	    
	    else {
	        return loginRequest.getAccountEmail();
	    }
	}
	
	@PostMapping("/admin/change-role-to-admin")
	public String changeRoleToAdmin(@RequestBody Account changeRoleRequest) {
		accountsRepository.changeToAdmin(changeRoleRequest.getAccountEmail());
		return "success";
	}
	
	@PostMapping("/admin/change-role-to-admin")
	public String changeRoleToGuest(@RequestBody Account changeRoleRequest) {
		accountsRepository.changeToGuest(changeRoleRequest.getAccountEmail());
		return "success";
	}
	
	@GetMapping("/admin/get-emails")
	public void getEmails() {
		accountsRepository.getEmail();
	}
	}
