package com.dev.asseement;

import java.util.HashMap;

public class Emplintimpl implements Emplint {

	HashMap<String, Employee> hm=new HashMap<String,Employee>();

	@Override
	public void insertdata(String value,Employee e,Employee e1 ) {
		hm.put("1", e);
		hm.put("2",e1);
		System.out.println("after added: "+hm);
	}

	@Override
	public void searchdata(int value) {
		hm.get(1);
		hm.get(2);
		System.out.println("after retrive the data:"+hm);
	}

	@Override
	public void removedata(int value) {
        Employee f=hm.remove("1");
       System.out.println("after removed:"+f);

	}

	@Override
	public void updatedata(String value, Employee e) {
		hm.put("1",e);
		System.out.println("after update: "+hm);
	}

	@Override
	public void calctax() {
		
	}

	@Override
	public void calcpay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void retrivesal(double sal) {
		// TODO Auto-generated method stub

	}



}
