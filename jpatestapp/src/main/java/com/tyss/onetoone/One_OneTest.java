package com.tyss.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpatestapp.dto.Person;
import com.tyss.jpatestapp.dto.Votercard;

public class One_OneTest {

	public static void main(String[] args) {
		Person person=new Person();
		person.setId(1);
		person.setName("kiran");
		person.setAge(22);
		
		Votercard vc=new Votercard();
		vc.setV_id(1);
		vc.setName("aaaaaa");
		
		person.setVotercard(vc);
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction tx=null;
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			tx=em.getTransaction();
			tx.begin();
			em.persist(person);                                       //unidirectional

//			Votercard votercard=em.find(Votercard.class, 1);
//			System.out.println(votercard.getPerson().getName());      //Bidirectional
			System.out.println("saved...");
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
}
