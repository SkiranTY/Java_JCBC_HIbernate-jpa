package com.tyss.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatestapp.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityTransaction transaction = null;
		EntityManager entitymanager = null;
		EntityManagerFactory entityManagerFactory = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager = entityManagerFactory.createEntityManager();
			transaction = entitymanager.getTransaction();
			transaction.begin();
			Movie movie = entitymanager.find(Movie.class, 101);
			entitymanager.remove(movie);
			System.out.println("record deleted");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
