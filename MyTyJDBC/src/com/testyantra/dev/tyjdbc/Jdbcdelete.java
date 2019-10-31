package com.testyantra.dev.tyjdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Jdbcdelete {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Connection c = null;
		PreparedStatement pstnt = null;

		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded........");

			// Get connection via driver
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\db.properties";

			FileReader reader = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(reader);

			c = DriverManager.getConnection(url, prop);
			System.out.println("connection established.......");

			// Issue SQL query
			String query = "delete from user_info where userid=? and password=?";
			pstnt = c.prepareStatement(query);
			System.out.println("enter user id for deletion");
			pstnt.setInt(1, Integer.parseInt(scn.nextLine()));
			System.out.println("enter the password for deletion");
			pstnt.setString(2, scn.nextLine());

			int i = pstnt.executeUpdate();

			// process the results;
			if (i > 0) {
				System.out.println("Query OK " + i + " Row effected");
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
