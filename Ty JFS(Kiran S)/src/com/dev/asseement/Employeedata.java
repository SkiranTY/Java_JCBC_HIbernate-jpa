package com.dev.asseement;

public class Employeedata {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(1);
		e.setEname("kiran");
		e.setEmail("kirans0803@gmail.com");
		e.setPassword("kiru08097");
		e.setSalary(2.4);

		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setEname("praveen");
		e1.setEmail("praveenng@gmail.com");
		e1.setPassword("praveen8799");
		e1.setSalary(3.2);

		Employee e2=new Employee();
		e2.setEmpid(3);
		e2.setEname("karthik");
		e2.setEmail("karthikmd@gmail.com");
		e2.setPassword("karthikmd78998");
		e2.setSalary(5.5);
		
		Emplintimpl f=new Emplintimpl();
		f.insertdata("1",e,e1);
	    f.searchdata(1);
		f.removedata(1);
		
	    e.setEmail("kiranjak");
	    f.updatedata("1",e);
			
	}
}


