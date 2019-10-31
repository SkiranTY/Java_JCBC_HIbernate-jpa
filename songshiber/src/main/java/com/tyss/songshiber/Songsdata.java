package com.tyss.songshiber;

import java.util.ArrayList;
import java.util.Scanner;

public class Songsdata {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int i;
		System.out.println("enter 1-4 to enter into cases");
		i=scn.nextInt();
		
		switch(i) {
		case 1:System.out.println("play a song");
		{
		Song_gs songs=new Song_gs();
		System.out.println("enter song id");
		songs.setSong_id(scn.nextInt());
		System.out.println("enter song name");
		songs.setSong_name(scn.nextLine());
		scn.nextLine();
		System.out.println("enter album name");
		songs.setAlbum_name(scn.nextLine());
		System.out.println("enter artist name");
		songs.setArtist_name(scn.nextLine());
		System.out.println("enter songlocation");
		songs.setSong_location(scn.nextLine());
		System.out.println("enter description");
		songs.setDescription(scn.nextLine());
		
		Songintimpl sint=new Songintimpl();
		sint.playallsongs(songs);
		
		}
		
		}
	}

}
