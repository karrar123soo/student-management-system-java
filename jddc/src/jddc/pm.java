package jddc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class pm {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String pawssord="root";
		String url="jdbc:mysql://localhost:3306/ali";
		
		Connection con=DriverManager.getConnection(url,username,pawssord);
		Statement st=con.createStatement();
		int r=st.executeUpdate("insert into employee values(200,'rashad',40)");
		System.out.println("data insert"+r);

	}

}
