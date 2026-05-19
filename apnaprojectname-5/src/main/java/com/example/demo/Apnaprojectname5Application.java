package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  class Apnaprojectname5Application implements CommandLineRunner {
	@Autowired
	private User userDao;

	public static void main(String[] args) {
		SpringApplication.run(Apnaprojectname5Application.class, args);
	}


public void run(String...args)throws Exception 
{
	User user1=new User("Aman", "Aman@gmail.com", "male", "delhi");
	
boolean status=	userDao.insertUser(user1);
if(status)
{
	System.out.println("User inserted successfully");
}
else
{
	System.out.println("User not inserted due to some error");
}
	
}
}

