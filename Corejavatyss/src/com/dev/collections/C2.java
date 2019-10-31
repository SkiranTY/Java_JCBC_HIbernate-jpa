package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class C2 {

	public static void main(String[] args) {
		HashMap<String, Dog> hm=new HashMap<String, Dog>();
 
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
		
		hm.put("1", d);                       //update
		hm.put("2", d1);                //return object that previously associated object
		hm.put("3", d2);
		System.out.println(hm);
		
		Dog e=hm.get("3");                   //retrive data
		System.out.println(e);
		
		
		//System.out.println(hm);
		
//		Dog f=hm.remove("2");                //returns the deleted object
//		System.out.println(f);
//		System.out.println(hm);
//		
//		System.out.println("output of containskey(): "+hm.containsKey("2"));      //return boolean
//		
//		System.out.println("output of containsValue(): "+hm.containsValue(d1));
	}

}
