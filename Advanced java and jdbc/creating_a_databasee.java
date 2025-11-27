package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class creating_a_databasee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Soma@2003");
		Statement stmt=conn.createStatement();
		boolean status=stmt.execute("create database login");
		if(status) {
			System.out.println("transaction failed");
			
		}
		conn.close();
		
	}

}
