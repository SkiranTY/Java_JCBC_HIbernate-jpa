package com.tyss.jpatestapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpatestapp.dto.Movie;

public class Readdemo {

	public static void main(String[] args) {
		
		EntityManager entitymanager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entitymanager=entityManagerFactory.createEntityManager();
		transaction=entitymanager.getTransaction();
		transaction.begin();
		
		String jpql="from Movie";
		javax.persistence.Query query=entitymanager.createQuery(jpql);
		List<Movie> resultList=query.getResultList();
		for(Movie movie : resultList) {
			System.out.println(movie.getId());
		}
		String jpql1="select name from Movie";
		javax.persistence.Query query1=entitymanager.createQuery(jpql1);
		List<String> resultList1=query1.getResultList();
		for(String string :resultList1) {
			System.out.println(string);
		}
//		String jplq2="update Movie set name='chak de india' where id=10";
		String jplq2="update Movie set name=:name1 where id=:id";
		javax.persistence.Query query2=entitymanager.createQuery(jplq2);
		query2.setParameter("name1","kabi jo badhal");
		query2.setParameter("id", 10);
		int count=query2.executeUpdate();
		transaction.commit();
		System.out.println(count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
