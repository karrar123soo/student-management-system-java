package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {
			
	@GetMapping
	public String getUser(@PathVariable int id) {
		return "user id"+id;
			
		}
			
	}


