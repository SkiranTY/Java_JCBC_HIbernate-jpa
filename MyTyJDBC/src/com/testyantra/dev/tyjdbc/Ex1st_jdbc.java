package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Ex1st_jdbc {
	public static void main(String[] args) {
		
		Connection c=null;
		Statement s=null;
		ResultSet r=null;
		
		try {
			//Load the driver
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver is loaded...");
			
			//get connection via driver
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			c=DriverManager.getConnection(url);
			System.out.println("connection establsd....");
			
			//Issue SQL query via connection
			String query="select * from user_info";
			s=c.createStatement();
			r=s.executeQuery(query);
			
			//process the result
			while(r.next()) {
			int userid=r.getInt("userid");
			String username=r.getString("username");
			String email=r.getString("email");
			
			System.out.println("userid="+userid);
			System.out.println("username="+username);
			System.out.println("email id="+email);
			System.out.println("**********************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(c!=null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(r!=null) {
				try {
					r.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
