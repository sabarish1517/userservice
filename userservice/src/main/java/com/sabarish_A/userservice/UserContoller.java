package com.sabarish_A.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserContoller {
	@Autowired
	private Userservice ser;
	@GetMapping("/userserv")
	public List<User> list()
	{
		return ser.listAll();
	}

}
