package com.tyss.songshiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Songintimpl implements Songint {


	public void playallsongs(Song_gs songs) {
	
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction ts=null;
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			ts=em.getTransaction();
			ts.begin();
			em.persist(songs);
			System.out.println("saved");
			ts.commit();
		}catch(Exception e) {
		e.printStackTrace();	
		}
	}

	public void playrandom() {
		// TODO Auto-generated method stub
		
	}

	public void playparticular() {
		// TODO Auto-generated method stub
		
	}

	public void searchsong() {
		// TODO Auto-generated method stub
		
	}

	public void showallsongs() {
		// TODO Auto-generated method stub
		
	}

	public void addsong() {
		// TODO Auto-generated method stub
		
	}

	public void editsong() {
		// TODO Auto-generated method stub
		
	}

	public void deletesong() {
		// TODO Auto-generated method stub
		
	}

	

}

