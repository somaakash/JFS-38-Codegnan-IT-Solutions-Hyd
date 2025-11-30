package com.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

//Insertion

public class PreparedDemofetching {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		
		 
			
		//1.loading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Get connecction
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibomma","root","Soma@2003");
		
	
		//2.Create prepareStatemment
		PreparedStatement psmt = conn.prepareStatement("select * from student");
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		ResultSetMetaData rm = rs.getMetaData();
		int column_count = rm.getColumnCount();
		System.out.println("column count :"+column_count);
		System.out.println("----------------------------------------------------------------");
		
		for(int i = 1;i<=column_count;i++) {
			System.out.println("column count:"+i);
			System.out.println("Column Name:"+rm.getColumnName(i));
			System.out.println("Column type name :"+rm.getColumnTypeName(i));
			System.out.println("column type size :"+rm.getColumnDisplaySize(i));
			
		}
		conn.close();
		System.out.println("Record Fetched");
	}

}
