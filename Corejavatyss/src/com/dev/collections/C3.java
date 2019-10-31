package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class C3 {

	public static void main(String[] args) {
		TreeSet<Dog> ts=new TreeSet<Dog>();
		
		Dog d=new Dog();
		d.setAge(1);
		d.setBreed("dobarman");
		d.setName("Shiro");
		d.setColor("white");
		
		Dog d1=new Dog();
		d1.setAge(2);
		d1.setBreed("labrador");
		d1.setName("Sonu");
		d1.setColor("gold");
		
		Dog d2=new Dog();
		d2.setAge(3);
		d2.setBreed("pug");
		d2.setName("pinky");
		d2.setColor("cream");
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		System.out.println(ts);

	}

}
