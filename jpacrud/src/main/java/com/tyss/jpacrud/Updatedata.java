package com.tyss.jpacrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.jpacrud.dto.Presidents;

public class Updatedata {

	public static void main(String[] args) {
		
		EntityManagerFactory ef=null;
		EntityManager em=null;
		EntityTransaction ts=null;
		
		
		try {
			ef=Persistence.createEntityManagerFactory("TestPersistence");
			em=ef.createEntityManager();
			ts=em.getTransaction();
			ts.begin();
			Presidents pres=em.find(Presidents.class, 2);
			pres.setPresidentName("Ram nath kovind");
			System.out.println("updated.......");
			ts.commit();
		}catch(Exception e) {
			ts.rollback();
			e.printStackTrace();
		}

	}

}
