package com.tyss.songshiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Songs")
public class Song_gs {
	
	@Id
	@Column
	private int song_id;
	@Column
	private String song_name;
	@Column
	private String album_name;
	@Column
	private String artist_name;
	@Column
	private String song_location;
	@Column
	private String Description;
	
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getSong_location() {
		return song_location;
	}
	public void setSong_location(String song_location) {
		this.song_location = song_location;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
