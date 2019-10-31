package com.tyss.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyTest {

	public static void main(String[] args) {
		
		Courses courses=new Courses();
		courses.setCid(100);
		courses.setC_name("java");
		
		Courses coueses1=new Courses();
		coueses1.setCid(107);
		coueses1.setC_name("SQL");
		
		ArrayList<Courses> arl=new ArrayList<Courses>();
		arl.add(courses);
		arl.add(coueses1);
		
		Students students=new Students();
		students.setSid(10);
		students.setName("kiran");
		students.setCourses(arl);

		Students students1=new Students();
		students1.setSid(20);
		students1.setName("praveen");
		students.setCourses(arl);
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction tx=null;
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			tx=em.getTransaction();
			tx.begin();
			em.persist(students);
			em.persist(students1);
//			Courses c1=em.find(Courses.class, 101);
//			System.out.println(c1.getStudents());
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
