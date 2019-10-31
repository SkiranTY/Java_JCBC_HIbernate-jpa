package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbcupgradation {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		Connection c=null;
		PreparedStatement pstnt=null;
		
		
		try {
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");
			
			// Get connection via driver
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			
			System.out.println("Enter the username and password");
			String user = scn.nextLine();
			String password = scn.nextLine();
			
			c=DriverManager.getConnection(url, user, password);
			System.out.println("connection estd.............");
			System.out.println("*********************************");
			
			//Issue SQL query
			String query="Update user_info set email=? where userid=? and password=?";
			
			pstnt=c.prepareStatement(query);
			
			System.out.println("Enter the email id....");
			pstnt.setString(1, scn.nextLine());
			System.out.println("Enter the user id.....");
			pstnt.setInt(2, Integer.parseInt(scn.nextLine()));
			System.out.println("enter the password.....");
			pstnt.setString(3, scn.nextLine());
			
			int count=pstnt.executeUpdate();
			
			//process the resultset
			if(count>0) {
				System.out.println("table updated "+count+" row affected");
			}else {
				System.out.println("something went wrong");
			}
			
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		}finally {
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstnt != null) {
				try {
					pstnt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			scn.close();
		}

	}

}
