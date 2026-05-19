package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@SpringBootApplication
public class Apnaprojectname15Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Apnaprojectname15Application.class, args);
		
		  UserRepository userRepository=context.getBean(UserRepository.class);
		  
		  User user=new User();
		  user.setName("karrar Raza");
		  user.setCity("Delhi");
		  user.setStatus("I am java programmer");
		  
		  userRepository.save(user);
	}

}
