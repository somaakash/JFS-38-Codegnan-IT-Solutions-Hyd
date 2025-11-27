package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insering_a_data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Soma@2003");
		Statement stmt=conn.createStatement();
		
		int result=stmt.executeUpdate("insert into signin values ('soma','soma@2003')");
		
		conn.close();
		System.out.println("table created :"+result);
	}

}
