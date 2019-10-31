package com.dev.music;

public class Songs {

	private int song_id;
	private String Song_name;
	private String Artist_name;
	private String Album_name;
	private String location;
	private String Description;

	@Override
	public String toString() {
		return "Songs [song_id=" + song_id + ", Song_name=" + Song_name + ", Artist_name=" + Artist_name
				+ ", Album_name=" + Album_name + ", location=" + location + ", Description=" + Description + "]";
	}

	public int getSong_id() {
		return song_id;
	}

	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}

	public String getSong_name() {
		return Song_name;
	}

	public void setSong_name(String song_name) {
		Song_name = song_name;
	}

	public String getArtist_name() {
		return Artist_name;
	}

	public void setArtist_name(String artist_name) {
		Artist_name = artist_name;
	}

	public String getAlbum_name() {
		return Album_name;
	}

	public void setAlbum_name(String album_name) {
		Album_name = album_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
