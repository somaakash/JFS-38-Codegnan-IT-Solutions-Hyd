package com.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

//Insertion

public class PreparedDemoDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 int id=sc.nextInt();
		
		 
			
		//1.loading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Get connecction
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibomma","root","Soma@2003");
		
	
		//2.Create prepareStatemment
		PreparedStatement psmt = conn.prepareStatement("delete from student where stid=?");
		psmt.setInt(1, id);
		int result = psmt.executeUpdate();
		
		
		conn.close();
		System.out.println("Record Deleted");
	}

}
