package com.dev.collections;

import java.util.TreeSet;

import com.dev.assignment.Employee;

public class As {

	public static void main(String[] args) {
		TreeSet<Employee> t=new TreeSet<Employee>();

		Employee e=new Employee();
		e.setId(3);
		e.setName("kiran");
		e.setEmail("kirans0803@gmail.com");
		e.setPassword(12234);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("praveen");
		e1.setEmail("praveenng@gmail.com");
		e1.setPassword(456789);
		
		Employee e2=new Employee();
		e2.setId(1);
		e2.setName("karthik");
		e2.setEmail("karthikmd@gmail.com");
		e2.setPassword(567890);
		
		t.add(e);
		t.add(e1);
		t.add(e2);
		
		System.out.println(t);
	}

}
