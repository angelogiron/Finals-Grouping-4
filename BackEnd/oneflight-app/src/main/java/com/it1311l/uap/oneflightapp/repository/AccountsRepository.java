package com.it1311l.uap.oneflightapp.repository;
import com.it1311l.uap.oneflightapp.model.Account;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountsRepository 
{
	@Select("SELECT * FROM accounts WHERE accountEmail = #{accountEmail}")
	Account findByEmail(String accountEmail);
	
	@Insert("INSERT INTO accounts(accountName, accountBirthday, accountPhoneNumber, accountPassportDetails, accountEmail, accountPassword) VALUES (#{accountName}, #{accountBirthday}, #{accountPhoneNumber}, #{accountPassportDetails}, #{accountEmail}, #{accountPassword})")
	public int insert(Account account);
}
