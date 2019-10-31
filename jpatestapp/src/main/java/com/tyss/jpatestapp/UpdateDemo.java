package com.tyss.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.tyss.jpatestapp.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=null;
		EntityManager entitymanager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager=entityManagerFactory.createEntityManager();
			transaction=entitymanager.getTransaction();
			transaction.begin();
			Movie movie=entitymanager.find(Movie.class, 10);
			movie.setId(10);
			movie.setName("Dil to bacha hai jii");
			System.out.println("record updated....");
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();                         //some errors like systemcrash, data not sent to DB,etc.., while storing to the data base
			e.printStackTrace();
		}finally {
			entitymanager.close();
		}

	}

}
