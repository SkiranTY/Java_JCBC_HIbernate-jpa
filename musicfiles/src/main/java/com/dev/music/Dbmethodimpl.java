package com.dev.music;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;



public class Dbmethodimpl  implements Dbmethods {

	ArrayList<Songs> al=new ArrayList<Songs>();
	static Songs s1 = new Songs();



	Scanner scn=new Scanner(System.in);
	static Connection c=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement pstnt=null;

	String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";



	public boolean storesongs(Object Songs) {

		try {
			FileReader reader = new FileReader(filepath);
			Properties prop = new Properties();
			prop.load(reader);
			String query = prop.getProperty("sqlA");
			st = c.createStatement();
			rs = st.executeQuery(query);

			// process the result set
			s1.setSong_id(5);
			s1.setSong_name("mugulunage...");
			s1.setArtist_name("yograjbhat");
			s1.setAlbum_name("mugulu nage");
			s1.setLocation("movies/love");
			s1.setDescription("3love");
			boolean songs=al.add(s1);
			
			System.out.println(s1);
																																																																																																																																																																																																																																																																																																									
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public Songs randomsongs() {
		try {
			FileReader reader = new FileReader(filepath);
			Properties prop = new Properties();
			prop.load(reader);
			String query = prop.getProperty("sqlB");
			st = c.createStatement();
			rs = st.executeQuery(query);

			// process the result set
			while (rs.next()) {
				int songid = rs.getInt("song_id");
				String songtitle = rs.getString("Song_title");
				String artistname = rs.getString("Artist_name");
				String albumname = rs.getString("Album_name");
				String Songlocation = rs.getString("Song_location");
				String description = rs.getString("Description");

				System.out.println("song id=" + songid);
				System.out.println("song Title=" + songtitle);
				System.out.println("Artist name=" + artistname);
				System.out.println("album name=" + albumname);
				System.out.println("song location=" + Songlocation);
				System.out.println("Description=" + description);
				System.out.println("********************************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Songs searchsongs() {
		try {
			// Issue sql query via connection
			FileReader reader = new FileReader(filepath);
			Properties prop = new Properties();
			prop.load(reader);
			String query = prop.getProperty("sqlC");
			pstnt = c.prepareStatement(query);
			System.out.println("enter the song title");
			pstnt.setString(1, "%"+scn.nextLine()+"%");

			rs = pstnt.executeQuery();

			// process the result set
			while (rs.next()) {

				int songid1 = rs.getInt("song_id");
				String songtitle = rs.getString("Song_title");
				String artistname = rs.getString("Artist_name");
				String albumname = rs.getString("Album_name");
				String Songlocation = rs.getString("Song_location");
				String description = rs.getString("Description");

				System.out.println("song id=" + songid1);
				System.out.println("song Title=" + songtitle);
				System.out.println("Artist name=" + artistname);
				System.out.println("album name=" + albumname);
				System.out.println("song location=" + Songlocation);
				System.out.println("Description=" + description);
				System.out.println("****************************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Songs> getsongs() {

		return null;
	}

	public ArrayList<Songs> getsongs(int song_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatesongs(Object Songs) {
		// TODO Auto-generated method stub
		return false;
	}



}
