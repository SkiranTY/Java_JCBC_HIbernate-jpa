package com.dev.music;

import java.util.ArrayList;

public interface Dbmethods  {

	public boolean storesongs(Object Songs);
	Songs randomsongs();
	Songs searchsongs();
	ArrayList<Songs> getsongs();
	ArrayList<Songs> getsongs(int song_id);
	boolean updatesongs(Object Songs);
}
