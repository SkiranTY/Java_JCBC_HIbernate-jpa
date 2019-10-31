package com.dev.assignment;

import java.util.HashMap;

public class Emplintimpl implements Emplint {

HashMap<String, Employee> hm=new HashMap<String, Employee>();
	

	@Override
	public void getEmployee() {
		System.out.println(hm);
	}
	

	@Override
	public boolean removeEmployee(Employee emp) {
		if(emp!=null) {
			hm.remove("1");
			return true;
		}
		return false;
	}

	@Override
	public void updateEmployee(String key, Employee emp) {
		emp.setEmail("hddjkkh@gmail.com");
		hm.put(key,emp);
	}

	@Override
	public boolean addEmployee(String key, Employee emp) {

		hm.put(key, emp);
		return true;
	}

	

}
