package com.tyss.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatestapp.dto.Movie;


public class App 
{
    public static void main( String[] args )
    {
        EntityTransaction transaction=null;
        EntityManager entitymanager=null;
        EntityManagerFactory entityManagerFactory=null;
        
        Movie movie=new Movie();
        movie.setId(10);
        movie.setName("abcd");
        movie.setRating("good");
        
        	try {
        	entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); //persistence context
        	entitymanager=entityManagerFactory.createEntityManager();
        	transaction=entitymanager.getTransaction();
        	transaction.begin();
        	entitymanager.persist(movie);
        	System.out.println("saved");
        	transaction.commit();
        }catch(Exception e) {
        	transaction.rollback();
        	e.printStackTrace();
        	
        }finally {
        	entitymanager.close();
        }
    }//end of the main method
}//end of the class
