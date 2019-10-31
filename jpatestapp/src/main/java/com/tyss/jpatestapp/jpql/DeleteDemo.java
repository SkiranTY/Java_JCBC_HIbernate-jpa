package com.tyss.jpatestapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatestapp.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityManager entitymanager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entitymanager=entityManagerFactory.createEntityManager();
		transaction=entitymanager.getTransaction();
		transaction.begin();	
	
//		String jplq2="delete from Movie where id=10";
		String jplq2="delete from Movie where id=:id1";
		javax.persistence.Query query2=entitymanager.createQuery(jplq2);
		query2.setParameter("id1", 10);
		int count=query2.executeUpdate();
		transaction.commit();
		System.out.println(count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
