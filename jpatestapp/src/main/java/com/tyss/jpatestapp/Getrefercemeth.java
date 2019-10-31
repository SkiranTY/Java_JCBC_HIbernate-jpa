package com.tyss.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpatestapp.dto.Movie;

public class Getrefercemeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entitymanager=entityManagerFactory.createEntityManager();
//			Movie movie1=entitymanager.find(Movie.class, 187);
//			System.out.println(movie.getClass());
			Movie movie=entitymanager.getReference(Movie.class, 187);
//			System.out.println(movie.getClass());
			System.out.println(movie.getId());
			System.out.println(movie.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
