package jddc;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class n {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/ducat";
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		Statement st=con.createStatement();
		int r=st.executeUpdate("insert into course values(1004,'javaScript',3)");
		System.out.println("data insert"+r);
		ResultSet rs=st.executeQuery("select * from course");
		ResultSetMetaData rsmd=rs.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			System.out.println(rsmd.getColumnTypeName(i));
			System.out.println(rsmd.getColumnName(i));
			System.out.println(rsmd.getColumnType(i));
		}
	
	}
}

