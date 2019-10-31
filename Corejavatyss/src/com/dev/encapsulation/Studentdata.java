package com.dev.encapsulation;

public class Studentdata {

	public static void main(String []args) {
		Student s=new Student();
		s.setRegno(2019001);
		s.setName("Rayan");
	    s.setEmail("ryan@gmail.com");
	    s.setPassword("1234");
	    
	    System.out.println("Regno:"+s.getRegno());
	    System.out.println("Name:"+s.getName());
	    System.out.println("Email:"+s.getEmail());
	    System.out.println("***********************");
	}
}
