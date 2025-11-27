package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqldemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Soma@2003");
		Statement stmt=conn.createStatement();
		
		boolean result=stmt.execute("create table signin(username varchar(20) ,password varchar(20))");
		
		conn.close();
		System.out.println("table created :"+result);
		
	}

}
