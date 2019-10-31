package com.testyantra.dev.tyjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbcinsertion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Connection c = null;
		PreparedStatement pstnt = null;

		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");               //Driver
			System.out.println("Driver Loaded........");

			// Get connection via driver
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter the username and password");
			String user = scn.nextLine();
			String password = scn.nextLine();

			c = DriverManager.getConnection(url, "root", "root");
			System.out.println("connection esbt......");
			System.out.println("*************************");

			//Issue SQL query via connection
			String query = "insert into user_info values(?,?,?,?)"; // other than select query is update query in java
			pstnt = c.prepareStatement(query);
			System.out.println("enter the user id.....");
			pstnt.setInt(1, Integer.parseInt(scn.nextLine()));
			System.out.println("enter the user name.......");
			pstnt.setString(2, scn.nextLine());
			System.out.println("enter the email......");
			pstnt.setString(3, scn.nextLine());
			System.out.println("enter the password");
			pstnt.setString(4, scn.nextLine());

			int count = pstnt.executeUpdate();

			// process the result set
			if (count > 0) {
				System.out.println("Query OK, " + count + " row effected");
			} else {
				System.out.println("something went wrong");
			}

		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		} finally {
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
