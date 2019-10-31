package com.tyss.jpacrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.jpacrud.dto.Presidents;

public class Retreivedata {

	public static void main(String[] args) {
		
		try {
			EntityManagerFactory ef=Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager em=ef.createEntityManager();
			Presidents pres=em.find(Presidents.class, 1);
			System.out.println(pres.getPresId());
			System.out.println(pres.getPresidentName());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
