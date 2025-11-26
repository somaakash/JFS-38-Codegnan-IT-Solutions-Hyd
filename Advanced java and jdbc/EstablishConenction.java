package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConenction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//loading the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Sathya@123");
	     
		if(conn!=null)
		{
			System.out.println("connection is established");
		}
	
	   //5 close the connection
		conn.close();
	}
}
