package com.sabarish_A.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Userservice {
	@Autowired
	private userRepository repo;
    public List<User> listAll()
    {
		return repo.findAll();
    	
    }
}
