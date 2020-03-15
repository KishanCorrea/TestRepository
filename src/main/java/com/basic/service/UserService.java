package com.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.entity.User;
import com.basic.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public void addUser()
	{
		User u=new User();
		u.setId(103L);
		u.setUserName("Kishan");
		u.setPassword("12345");
		repo.save(u);
	}
}
