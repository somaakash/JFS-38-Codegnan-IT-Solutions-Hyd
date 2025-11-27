package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.get the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Soma@2003");
	    //3.create a statement 
		Statement stmt=conn.createStatement();
//ddl-execute(),dml--executeUpdate(),drl--executeQuery()
	    //4.execute a statement (fetching data)
		ResultSet result=stmt.executeQuery("select * from signin");
       
		while(result.next())
		{
		System.out.println(result.getString(1)+" "+result.getString(2));	
		}
	//5.close the connection 
		conn.close();

	}

}
