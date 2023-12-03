package com.it1311l.uap.oneflightapp.repository;
import com.it1311l.uap.oneflightapp.model.Account;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountsRepository 
{
	@Select("SELECT * FROM accounts WHERE accountEmail = #{accountEmail}")
	Account findByEmail(String accountEmail);
	
	@Select("SELECT acountEmail FROM accounts")
	public void getEmail();
  
	@Insert("INSERT INTO accounts(accountName, accountBirthday, accountPhoneNumber, accountPassportDetails, accountEmail, accountPassword, role) VALUES (#{accountName}, #{accountBirthday}, #{accountPhoneNumber}, #{accountPassportDetails}, #{accountEmail}, #{accountPassword},guest)")
	public int insert(Account account);
	
	@Update("UPDATE accounts SET role ='guest' WHERE accountEmail = {accountEmail}")
	public String changeToGuest(String email);
	
	@Update("UPDATE accounts SET role ='admin' WHERE accountEmail = {accountEmail}")
	public String changeToAdmin(String email);
	
	
}
