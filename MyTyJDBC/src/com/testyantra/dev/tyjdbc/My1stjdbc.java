package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class My1stjdbc {
	public static void main(String[] args) {

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
				// Load the Driver
				Driver d=new com.mysql.jdbc.Driver();
				DriverManager.registerDriver(d);
				System.out.println("driver loaded....");

				// Get connection via driver
				String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

				conn = DriverManager.getConnection(dbUrl);
				System.out.println("connection estd..........");
				System.out.println("************************************");

				// Issue Sql query via connection
				String query = "select * from user_info";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);

				// Process the result returned by SQL query
				while (rs.next()) {
					int userid = rs.getInt("userid");
					String username = rs.getString("username");
					String email = rs.getString("email");
					
					System.out.println("User Id="+userid);
					System.out.println("User Name="+username);
					System.out.println("User emai lId="+email);
					System.out.println("*****************************");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn!=null) {
					try {
						conn.close();                             //close all JDBC objects
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(rs!=null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
}
