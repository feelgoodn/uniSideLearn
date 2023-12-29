package com.uniSideLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniSideLearn.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer> 
{
	boolean existsByEmail(String email);
	
	
	UserInfo getByEmail(String email);

}
