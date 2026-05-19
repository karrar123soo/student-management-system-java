package jddc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preoared {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection establish
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/raza";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps=con.prepareStatement("insert into   employee(id, name, rollon) values(?,?,?)");
		ps.setInt(1, 1000);
		ps.setString(2,"karrar");
		ps.setInt(3,7688);
		
	
		int m=ps.executeUpdate();
		System.out.println("data insert "+m);
		

	}

}
