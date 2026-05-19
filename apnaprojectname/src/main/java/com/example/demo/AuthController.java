package com.example.demo;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private JwtUtil jwtUtil=new JwtUtil();
	
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest request) {
		
		System.out.println("USERNAME:"+request.getUsername());
		System.out.println("PASSWORD:"+request.getPassword());
		
		
		if("admin".equals(request.getUsername())&&"1234".equals(request.getPassword())) {
			return jwtUtil.generateToken(request.getUsername());
		}
		return"Invalid credentials";
	}
		

		
	
	
	
	
	
	@GetMapping("/test")
	public String test() {
		return"Public API working";
		
		

		
	
	
	
	
	}

}
