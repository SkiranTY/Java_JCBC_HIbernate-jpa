package com.tyss.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyTest {

	public static void main(String[] args) {
		Pencils pencils=new Pencils();
		pencils.setPid(1);
		pencils.setPname("apsara-HB_1");
		
		Pencils pencils1=new Pencils();
		pencils1.setPid(2);
		pencils1.setPname("apsara-xyz");
		ArrayList<Pencils> ape=new ArrayList<Pencils>();
		ape.add(pencils);
		ape.add(pencils1);
		
		Pencilbox pencilbox=new Pencilbox();
		pencilbox.setBoxid(1);
		pencilbox.setBoxname("apsaraBox");
		pencilbox.setPencils(ape);
		
		
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction tx=null;
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			tx=em.getTransaction();
			tx.begin();
			em.persist(pencilbox);
			System.out.println("saved");
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		
	}
}
