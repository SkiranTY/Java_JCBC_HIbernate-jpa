package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class Alist {

	public static void main(String[] args) {
		ArrayList<Dog> arl=new ArrayList<Dog>();
		
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
		
		arl.add(d);
		arl.add(d1);
		arl.add(d2);

		System.out.println(arl);
		System.out.println("size of arraylist before trim(): "+arl.size());
		
		arl.trimToSize();
		System.out.println("size after the trim(): "+arl.size());
		
		
	}

}
