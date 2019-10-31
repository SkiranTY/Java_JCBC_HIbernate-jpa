package com.dev.collections;

import java.util.HashMap;
import java.util.HashSet;

import com.dev.assignment.Employee;

public class Crud {

	public static void main(String[] args) {
		HashSet<Employee> h1=new HashSet<Employee>();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("kiran");
		e.setEmail("kirans0803@gmail.com");
		e.setPassword(12234);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("praveen");
		e1.setEmail("praveenng@gmail.com");
		e1.setPassword(456789);
		
		Employee e2=new Employee();
		e2.setId(3);
		e2.setName("karthik");
		e2.setEmail("karthikmd@gmail.com");
		e2.setPassword(567890);
		
		System.out.println("before update");
		System.out.println();
		
		boolean s=h1.add(e);
		boolean s1=h1.add(e1);
		boolean s2=h1.add(e2);
		 
		System.out.println(h1);
		
		System.out.println("after update");
		System.out.println();
		
		e.setEmail("kiru@gmail");
		e1.setEmail("prav@gmail");
		e2.setEmail("karthik@gmail");
		
		
		
		System.out.println("for add(): "+s+" "+s1+" "+s2);
		System.out.println(h1);
		
		boolean r=h1.remove(e);
		System.out.println("for remove(): "+r);
		System.out.println("after removed: ");
		System.out.println(h1);
	
		h1.clear();
		System.out.println("size after  clear():"+h1.size());
	}

}
