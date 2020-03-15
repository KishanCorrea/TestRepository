package com.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.service.UserService;

@RestController
public class BasicController {

	@Autowired
	UserService userService;
	
	@GetMapping(value = "/")
	public String getMessage()
	{
		userService.addUser();
		return "Here Comes the Devil";
	}
}
