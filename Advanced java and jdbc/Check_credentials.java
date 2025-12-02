package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Check_credentials {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		
		
		
		//1.loading driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
				
			//2.Get connecction
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/credentials","root","Soma@2003");
			
			PreparedStatement psmt=conn.prepareStatement("Select*from userdetails where username=? and password=?");
			
			psmt.setString(1,username);
			psmt.setString(2,password);
			
			ResultSet rs=psmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("Login success");
			}
			else {
				System.out.println("login denied.........");
			}
				

	}

}
