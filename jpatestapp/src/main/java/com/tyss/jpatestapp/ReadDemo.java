package com.tyss.jpatestapp;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.tyss.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManager entitymanager=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager=entityManagerFactory.createEntityManager();
			Movie movie=entitymanager.find(Movie.class, 10);
			System.out.println(entitymanager.contains(movie));
			entitymanager.detach(movie);
			System.out.println(entitymanager.contains(movie));
			
//			System.out.println(movie.getId());
//			System.out.println(movie.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
