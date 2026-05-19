package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping
	public String addUser(@RequestBody User user) {
		
		boolean status=userDao.insertUser(user);
			
		
		if(status) {
			return "Inserted";
		}
		return"Failed";
		
	
		}
	@GetMapping("/test")
	public String test () {
		return "working";
		
		
	
	
	}
}



