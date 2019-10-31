package com.dev.assignment;

public class Empldata {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("kiran");
		e.setEmail("kira@jakjak.com");
		e.setPassword(56789);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("praveen");
		e1.setEmail("pravven@jakjak.com");
		e1.setPassword(67890);
		
		Emplintimpl f = new Emplintimpl();
		boolean b = f.addEmployee("1", e);
		System.out.println(b);
		System.out.println(f.hm);
		
		f.updateEmployee("2", e1);
		System.out.println(f.hm);
		
		boolean c=f.addEmployee("3", e);
		System.out.println(c);
		System.out.println(f.hm);
		
		boolean d=f.removeEmployee(e);
	    System.out.println(d);
	    System.out.println(f.hm);
	    
	    f.getEmployee();
	}

}
