package com.dev.music;

import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Dbhelper extends Dbmethodimpl {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		try {
			// Load the driver
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			System.out.println("driver is loaded.......");

			// get connection via driver
			String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

			c = DriverManager.getConnection(url);
			System.out.println("connection is done......");
			System.out.println("*******************************");

			// Issue SQL query via connection
			
			Dbmethodimpl dimp = new Dbmethodimpl();

			int press;
			System.out.println("enter 1-4 for musicfiles");
			press = scn.nextInt();

			switch (press) {
			case 1:
				System.out.println("Play a song"); {
					int c;
					System.out.println("enter the options 1-3");
					c = scn.nextInt();
					switch (c) {
					case 1:
						System.out.println("play all songs"); {
							dimp.storesongs(s1);
						}
						break;
					case 2:
						System.out.println("Play songs randomly"); {
							dimp.randomsongs();
						}
						break;
					case 3:System.out.println("play a particular songs");
					{
						dimp.searchsongs();
					}
					break;
					}
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
