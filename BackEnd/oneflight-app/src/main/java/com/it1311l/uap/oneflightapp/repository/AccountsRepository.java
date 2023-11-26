package com.it1311l.uap.oneflightapp.repository;
import com.it1311l.uap.oneflightapp.model.Account;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountsRepository 
{
	@Insert("INSERT INTO accounts(accountId, accountName, accountBirthday, accountPhoneNumber, accountPassportDetails, accountEmail, accountPassword) VALUES (#{accountId}, #{accountName}, #{accountBirthday}, #{accountPhoneNumber}, #{accountPassportDetails}, #{accountEmail}, #{accountPassword})")
	public int insert(Account account);
}
