package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(User user) {
		String sql="INSERT INTO users(name,email,gender,city)VALUES(?,?,?,?)";
		
		int result=jdbcTemplate.update(
				sql,
				user.getName(),
				user.getEmail(),
				user.getGender(),
				user.getCity()
				);
		return result >0;
		
	}

}
