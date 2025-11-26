package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.loading the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.get the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sleeping", "root", "Sathya@123");
	    //3.create a statement 
		Statement stmt=conn.createStatement();
//ddl-execute(),dml--executeUpdate(),drl--executeQuery()
	    //4.execute a statement (deleting operation)
		int deleted=stmt.executeUpdate("DELETE FROM CUSTOMER WHERE CUSID=123");
    //close the connection
		conn.close();
		
		System.out.println("deleted record :"+deleted);
	
	
	}
}
