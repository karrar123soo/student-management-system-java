package jddc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class DataInsert {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username="root";
		String password="root";
		String url="jdbc: mysql://localhost:3306/ducat";
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		int r=st.executeUpdate("insert into student values(500,'raman',45)");
		System.out.println("data insert"+r);
		

	}

}
