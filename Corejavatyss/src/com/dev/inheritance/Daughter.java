package com.dev.inheritance;

public class Daughter extends Father{
static Grandfather d=new Daughter();
static Grandfather d1=new Daughter();
static Daughter d2= (Daughter) d1;

@Override
public void printname() {
	String name="ayra";
	System.out.println(name+" "+super.name+" "+d.lastname);
}
	public static void main(String[] args) {
	d1.printname();

	}

}
