package com.tyss.jpacrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.jpacrud.dto.Presidents;

public class Insert {

	public static void main(String[] args) {
		Presidents pres = new Presidents();
		pres.setPresId(1);
		pres.setPresidentName("Dr.Babu Rajendra Prasad");
		
		EntityManagerFactory ef = null;
		EntityManager em = null;
		EntityTransaction ts = null;
		
		try {
			ef = Persistence.createEntityManagerFactory("TestPersistence");
			em = ef.createEntityManager();
			ts = em.getTransaction();
			ts.begin();
			em.persist(pres);
			System.out.println("insert success..");
			ts.commit();
			
		}catch(Exception e) {
			ts.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
