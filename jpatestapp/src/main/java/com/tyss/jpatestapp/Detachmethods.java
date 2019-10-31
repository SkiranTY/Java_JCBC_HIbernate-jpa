package com.tyss.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.tyss.jpatestapp.dto.Movie;

public class Detachmethods {

	public static void main(String[] args) {
	
		EntityManager entitymanager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager=entityManagerFactory.createEntityManager();
			transaction=entitymanager.getTransaction();
			transaction.begin();
			Movie movie=entitymanager.find(Movie.class, 10);
			System.out.println(entitymanager.contains(movie));
			entitymanager.detach(movie);
			System.out.println(entitymanager.contains(movie));
			movie.setRating("moderate");
			Movie m1=entitymanager.merge(movie);
			System.out.println(entitymanager.contains(movie));
			System.out.println(entitymanager.contains(m1));
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		
	}

}
}
