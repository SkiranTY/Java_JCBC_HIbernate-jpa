package com.ty.excer;

public class Student {

	private int id;
	private String name;
	private String bloodGroup;
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("kiran");
		s.setBloodGroup("A+");
		
		MyArrayLIst<Student> arr=new MyArrayLIst<Student>();
		arr.add(s);
	}
}
