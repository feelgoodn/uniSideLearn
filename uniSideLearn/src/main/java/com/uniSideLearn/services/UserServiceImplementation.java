package com.uniSideLearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniSideLearn.entity.UserInfo;
import com.uniSideLearn.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService
{

	@Autowired
     UserRepository repo;

	@Override
	public String addUser(UserInfo user) {
		  repo.save(user);
		return "Student added successfully!";
	}

	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
         if(repo.existsByEmail(email)) {
        	UserInfo u= repo.getByEmail(email);
        	String dbPassword =u.getPassword();
        	if(password.equals(dbPassword))
        	{
        		return true;
        	}
        	else
        	{
        		return false;
        	}
          }
         else
         {
        	 return false;
         }
	}

	@Override
	public String getUseRole(String email) {
		UserInfo u =repo.getByEmail(email);
		return u.getRole();
	}
	
	
	
	

}
