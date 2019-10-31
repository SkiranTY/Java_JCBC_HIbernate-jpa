package com.dev.collections;


import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {
		HashSet<Dog> hs= new HashSet<Dog>();
		
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
		
		d.setAge(2);
		d1.setAge(3);
		d2.setAge(4);
		
		boolean b=hs.add(d);
		boolean b1=hs.add(d1);
		boolean b3=hs.add(d2);
		System.out.println("output of add(): "+b+" "+b1+" "+b3);
		
		for(Dog dog : hs) {                           // only inherits the properties of iterable this is not able in HashMap bcs it is not extends iterable/collection
			System.out.println(dog);
		}
		

	
		System.out.println("size after add size(): "+hs.size());
		
		boolean b2=hs.remove(d);
		System.out.println("output of remove(): "+b2);
		for(Dog dog : hs) {                           
			System.out.println(dog);
		}
		
		
		System.out.println("output of contains(): "+hs.contains(d));
		
		System.out.println("size after remove  size(): "+hs.size());
		
		hs.clear();
		System.out.println("size after clear size(): "+hs.size());
	}
}
