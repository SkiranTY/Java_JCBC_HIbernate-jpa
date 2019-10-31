package com.dev.musicfiles;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Music {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pstnt = null;

		int press;
		System.out.println("Press the number 1-4");
		press = scn.nextInt();

		switch (press) {

		case 1:
			System.out.println("Play a song"); {
				int c;
				System.out.println("enter the options 1-3");
				c = scn.nextInt();

				switch (c) {

				case 1:
					System.out.println("play all songs"); // case A of case 1 is begin
					{

						try {
							// Load the driver

							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");
							System.out.println("*******************************");

							// Issue sql query via connection
							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							String query = prop.getProperty("sqlA");
							st = conn.createStatement();
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
								System.out.println("*********************************************");
							}

						} catch (Exception e) {
							System.err.println("music files not found");
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
							if (st != null) {
								try {
									st.close();
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

					} // case A of case 1 closed
					break;

					// case B of case 1 begins
				case 2:
					System.out.println("Play songs randomly"); {

						try {
							// Load the driver
							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");

							// Issue sql query via connection
							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							String query = prop.getProperty("sqlB");
							st = conn.createStatement();
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

						} catch (Exception e) {
							System.err.println("music files not found");
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
							if (st != null) {
								try {
									st.close();
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
					} // case B of case 2 ends
					break;

				case 3:
					System.out.println("play a particular song"); {
						// case c of case 1 is begin

						try {
							// Load the driver
							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");

							// Issue sql query via connection
							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							String query = prop.getProperty("sqlC");
							pstnt = conn.prepareStatement(query);
							scn.nextLine();
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

						} catch (Exception e) {
							System.err.println("music files not found");
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
							if (st != null) {
								try {
									st.close();
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
						break;
					} // case c of case 1 is closed
				default:
					System.out.println("no music are found...");
					break;
				}// inner switch closed
			} // case 1 is closed
			break;

			// case 2 is begin
		case 2:
			System.out.println("search a song"); {
				try {
					// Load the driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded........");

					// get connection via driver
					String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

					conn = DriverManager.getConnection(url);
					System.out.println("connection is done......");

					// Issue sql query via connection
					String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
					FileReader reader = new FileReader(filepath);
					Properties prop = new Properties();
					prop.load(reader);
					String query = prop.getProperty("sql2");
					pstnt = conn.prepareStatement(query);
					scn.nextLine();

					System.out.println("search song.......");
					String e = scn.nextLine();
					pstnt.setString(1, "%" + e + "%");

					rs = pstnt.executeQuery();

					// process the result set
					while (rs.next()) {
						int songid = rs.getInt("song_id");
						String songtitle=rs.getString("Song_title");
						String artistname = rs.getString("Artist_name");
						String albumname = rs.getString("Album_name");
						String Songlocation = rs.getString("Song_location");
						String description = rs.getString("Description");

						System.out.println("song id=" + songid);
						System.out.println("song title="+songtitle);
						System.out.println("Artist name=" + artistname);
						System.out.println("album name=" + albumname);
						System.out.println("song location=" + Songlocation);
						System.out.println("Description=" + description);
						System.out.println("**********************************");
					}

				} catch (Exception e) {
					System.err.println("u are searching song is not found......");
					System.err.println("music files not found");
					e.printStackTrace();
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if (st != null) {
						try {
							st.close();
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
			} // case 2 ends
			break;

			// case 3 begins
		case 3:
			System.out.println("print all the songs"); {
				try {
					// Load the driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded........");

					// get connection via driver
					String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

					conn = DriverManager.getConnection(url);
					System.out.println("connection is done......");

					// Issue sql query via connection
					String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
					FileReader reader = new FileReader(filepath);
					Properties prop = new Properties();
					prop.load(reader);
					String query = prop.getProperty("sql3");
					st = conn.createStatement();
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
						System.out.println("***************************************");
					}

				} catch (Exception e) {
					System.err.println("music files not found");
					e.printStackTrace();
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if (st != null) {
						try {
							st.close();
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
			} // case 3 is closed
			break;

			// case 4 begins

		case 4:
			System.out.println("Song opertations........."); {

				// main switch4

				int q;
				System.out.println("Enter 1-3 for opearations");
				q = scn.nextInt();

				switch (q) {
				case 1:
					System.out.println("add song..."); {
						try {
							// Load the driver
							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");

							// Issue sql query via connection
							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							String query = prop.getProperty("sql4A");
							pstnt = conn.prepareStatement(query);

							System.out.println("enter songid....");
							pstnt.setInt(1, scn.nextInt());
							scn.nextLine();
							System.out.println("enter songtitle.....");
							pstnt.setString(2, scn.nextLine());
							System.out.println("enter artistname..........");
							pstnt.setString(3, scn.nextLine());
							System.out.println("enter Albumname.....");
							pstnt.setString(4, scn.nextLine());
							System.out.println("enter songlocation.....");
							pstnt.setString(5, scn.nextLine());
							System.out.println("enter Description......");
							pstnt.setString(6, scn.nextLine());

							int count = pstnt.executeUpdate();

							// process the result set
							if (count > 0) {
								System.out.println("Query OK, " + count + " row effected");
							} else {
								System.out.println("something went wrong");
							}

						} catch (Exception e) {
							System.err.println("music files not found");
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
							if (st != null) {
								try {
									st.close();
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
					break;

					// case 2 of case 4 begins
				case 2:
					System.out.println("updating the song......."); {

						try {
							// Load the driver
							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");

							// Issue sql query via connection
							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";
							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							String query = prop.getProperty("sql4B");
							pstnt = conn.prepareStatement(query);

							System.out.println("enter songid...");
							pstnt.setString(1, scn.nextLine());
							System.out.println("enter songtitle....");
							pstnt.setString(2, scn.nextLine());
							scn.nextLine();
							
							int count= pstnt.executeUpdate();

							// process the result set
							if (count > 0) {
								System.out.println("Query ok " + count + " updated");
							} else {
								System.out.println("something wrong");
							}

						} catch (Exception e) {
							System.err.println("music files not found");
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
								
							}
							if (st != null) {
								try {
									st.close();
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
							scn.close();
						}
						break;
					} // case 2 of case 4

				case 3:
					System.out.println("delete the songs...."); {
						// case 3 of case 4 begins
						try {
							// Load the driver
							Class.forName("com.mysql.jdbc.Driver");
							System.out.println("Driver Loaded........");

							// Get connection via driver
							String url = "jdbc:mysql://localhost:3306/musicplayer?user=root&password=root";

							conn = DriverManager.getConnection(url);
							System.out.println("connection is done......");

							String filepath = "C:\\Users\\Srinivas R Setty\\Desktop\\music.properties";

							FileReader reader = new FileReader(filepath);
							Properties prop = new Properties();
							prop.load(reader);
							conn = DriverManager.getConnection(url, prop);
							System.out.println("connection established.......");

							// Issue a SQl query

							String query = prop.getProperty("sql4C");
							pstnt = conn.prepareStatement(query);

							System.out.println("enter songid for deletion");
							pstnt.setInt(1,scn.nextInt());
							scn.nextLine();

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
							if (conn != null) {
								try {
									conn.close();
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
						break;
					} // case 3 of case 4 ends
				}
				break;
			}
		}// main switch

	}

}
