package com.uniSideLearn.services;

import com.uniSideLearn.entity.UserInfo;

public interface UserService 
{
	
	//add new user to database
	String addUser(UserInfo user);
	
	//check email is already present or not
	boolean checkEmail(String email);
	//Validate user credentials
	boolean validate(String email, String password);
	
	
	//Get the user's role by providing the email
	String getUseRole(String email);

}
