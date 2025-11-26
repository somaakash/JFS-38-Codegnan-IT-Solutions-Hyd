package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//1.loading the driver class
	Class.forName("com.mysql.cj.jdbc.Driver");
	//2.get the connection 
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sleeping", "root", "Sathya@123");
	//3.create a statement 
	Statement stmt=conn.createStatement();
	//4.execute a statment
	   //create a table
	//boolean result=stmt.execute("create table student(stid int,stname varchar(10),stmarks int)");
	/*----inserting a record-----------*/
	//int result=stmt.executeUpdate("insert into student values(122,'keerthi',90);");
/*-----------------fetching data from db-------------*/
	ResultSet rs=stmt.executeQuery("select * from student");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	
/*----------------UPDATING A RECORD------------------*/
	 // int upd=stmt.executeUpdate("update student set stname='suresh' where stid=122");
	
/*------------deleting a record-----------------*/
	//int dltd=stmt.executeUpdate("DELETE FROM STUDENT");
	
	//5.close the connection
	conn.close();
	//System.out.println("record deleted :"+dltd);
}
}
