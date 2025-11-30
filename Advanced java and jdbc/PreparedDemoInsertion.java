package com.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Insertion

public class PreparedDemoInsertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter student id");
		int id =sc.nextInt();
		
		System.out.println("Enter student name");
		String name = sc.next();
		
		System.out.println("Enter student marks");
		int marks = sc.nextInt();
			
		//1.loading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Get connecction
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibomma","root","Soma@2003");
		
	
		//2.Create prepareStatemment
		PreparedStatement psmt = conn.prepareStatement("insert into student value(?,?,?)");
		psmt.setInt(1,id);
		psmt.setString(2,name);
		psmt.setInt(3,marks);
		
		psmt.executeUpdate();
		conn.close();
		System.out.println("Record Inserted");
	}

}
