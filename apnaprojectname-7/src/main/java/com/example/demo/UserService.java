package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
	}

}
