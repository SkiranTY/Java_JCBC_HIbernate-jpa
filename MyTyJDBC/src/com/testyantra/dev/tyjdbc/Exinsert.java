package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Exinsert {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		Connection c=null;
		PreparedStatement st=null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded.....");
			
			//Get the connection via driver
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("enter username");
			String user=scn.nextLine();
			System.out.println("enter password");
			String password=scn.nextLine();
			
			c=DriverManager.getConnection(url, user, password);
			System.out.println("connection established.........");
			
			//Issue a SQL query via connection
			String query="insert into user_info values(?,?,?,?)";
			st=c.prepareStatement(query);
			System.out.println("enter user id...");
			st.setInt(1, Integer.parseInt(scn.nextLine()));
			System.out.println("enter username.....");
			st.setString(2, scn.nextLine());
			System.out.println("enter email....");
			st.setString(3, scn.nextLine());
			System.out.println("enter password.....");
			st.setString(4, scn.nextLine());
			
			int count=st.executeUpdate();
			
			//process the result set 
			if(count>0) {
				System.out.println("Qeury Ok "+count+" row effected");
			}else{
				System.out.println("something went wrong");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(c!=null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		scn.close();
	}

}
