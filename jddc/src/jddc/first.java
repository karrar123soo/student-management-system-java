package jddc;

import java.sql.DriverManager;

import java.sql.Connection;


public class first {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Load the driver
		Class.forName("com.mysql.jdbc.Deriver");
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/hasan";
		
		Connection Con=DriverManager.getConnection(url,username,password);
		
		if(Con.isClosed())
		{
			System.out.println("connection closed");
		}
		else
		{
			System.out.println("connection established");
		}
				
		

	}

}
