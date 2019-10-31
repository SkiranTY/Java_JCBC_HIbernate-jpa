package com.tyss.hotelbill;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.hotelbill.dto.Hotel_Bill;

public class Hotel_Billintimpl implements Hotel_Billint {

	Scanner scn = new Scanner(System.in);
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;

	public void showallfooditems() {
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			Hotel_Bill bill=em.find(Hotel_Bill.class, 121);
			Hotel_Bill bill1=em.find(Hotel_Bill.class, 122);
			Hotel_Bill bill2=em.find(Hotel_Bill.class, 565);
			System.out.println("showing all food items.....");
			System.out.println(bill);
			System.out.println(bill1);
			System.out.println(bill2);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	public void insertfooditems() {

		Hotel_Bill hb1 = new Hotel_Bill();
		System.out.println("enter food item code");
		hb1.setItem_Code(scn.nextInt());
		System.out.println("enter food item name");
		hb1.setFood_Name(scn.nextLine());
		scn.nextLine();
		System.out.println("enter food price");
		hb1.setPrice(scn.nextDouble());

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			em.persist(hb1);
			System.out.println("inserted");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}

	public void updatefooditems() {

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			System.out.println("update your food item");
			System.out.println("enter the food item code to update");
			Hotel_Bill hotelBill = em.find(Hotel_Bill.class, scn.nextInt());
			System.out.println("update which food u want else:");
			hotelBill.setFood_Name(scn.nextLine());
			scn.nextLine();
			System.out.println("updated");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}

	public void deletefooditems() {
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			System.out.println("enter the item code to remove");
			Hotel_Bill hotelBill = em.find(Hotel_Bill.class, scn.nextInt());
			em.remove(hotelBill);
			System.out.println("removed...");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}

	public void takeorderfromcustomers() {

		int itemcode;
		System.out.println("enter food code");
		itemcode = scn.nextInt();
		double sum=0;
		if(itemcode != 0) {
			System.out.println("add food items what else u want");
			itemcode=scn.nextInt();
			Hotel_Bill b=new Hotel_Bill();
//			b.setItem_Code(scn.nextInt());
			b= em.find(Hotel_Bill.class, itemcode);
			double c=b.getPrice();
			sum=sum+c;
		}
		System.out.println(" total bill generated is : "+sum);
	}

	public void additems() {

		Hotel_Bill hb = new Hotel_Bill();
		System.out.println("enter food item code");
		hb.setItem_Code(scn.nextInt());
		System.out.println("enter food item name");
		hb.setFood_Name(scn.nextLine());
		scn.nextLine();
		System.out.println("enter food price");
		hb.setPrice(scn.nextDouble());

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			em.persist(hb);
			System.out.println("items added....");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	public void removefooditems() {

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			System.out.println("enter the item code to remove");
			Hotel_Bill hotelBill1 = em.find(Hotel_Bill.class, scn.nextInt());
			em.remove(hotelBill1);
			System.out.println("removed...");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}

	public void modifyfooditems() {

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			System.out.println("enter item code to modify");
			Hotel_Bill hotelBill = em.find(Hotel_Bill.class, scn.nextInt());
			System.out.println("modify food name");
			hotelBill.setFood_Name(scn.nextLine());
			System.out.println("modify the price");
			hotelBill.setPrice(scn.nextDouble());
			System.out.println("updated");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	public void totalbillday() {

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			String jpql1 = "sum(price) from hotel_bill";
			Query query = em.createQuery(jpql1);
			List<String> resultList1=query.getResultList();
			for(String string :resultList1) {
				System.out.println(string);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
