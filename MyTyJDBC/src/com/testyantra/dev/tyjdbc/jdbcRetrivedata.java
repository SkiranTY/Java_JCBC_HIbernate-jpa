package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcRetrivedata {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Connection c = null;
		PreparedStatement pstnt = null;
		ResultSet rs = null;

		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");

			// Get connection via driver
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";

			System.out.println("Enter the username and password");
			String user = scn.nextLine();
			String password = scn.nextLine();

			c = DriverManager.getConnection(url, user, password);
			System.out.println("connection estd.............");
			System.out.println("*********************************");

			// Issue SQL query
			String query = "select * from user_info where userid=? and password=?";

			pstnt = c.prepareStatement(query);

			System.out.println("Enter the user id.....");
			pstnt.setInt(1, Integer.parseInt(scn.nextLine()));
			System.out.println("enter the password.....");
			pstnt.setString(2, scn.nextLine());

			rs = pstnt.executeQuery();

			// process the resultset
			while (rs.next()) {
				int u_id = rs.getInt("userid");
				String u_name = rs.getString("username");
				String u_email = rs.getString("email");

				System.out.println("user id= " + u_id);
				System.out.println("user name= " + u_name);
				System.out.println("user email= " + u_email);

			}

		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close(); // close all JDBC objects
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
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
