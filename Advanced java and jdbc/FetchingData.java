package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.loading the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.get the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sleeping", "root", "Sathya@123");
	    //3.create a statement 
		Statement stmt=conn.createStatement();
//ddl-execute(),dml--executeUpdate(),drl--executeQuery()
	    //4.execute a statement (fetching data)
		ResultSet result=stmt.executeQuery("select * from customer");
       
		while(result.next())
		{
		System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3));	
		}
	//5.close the connection 
		conn.close();
	
	}
}
