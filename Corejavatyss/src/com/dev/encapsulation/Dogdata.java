 package com.dev.encapsulation;

public class Dogdata {

	public static void main(String []args) {
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		
		d1.setAge(1);
		d1.setBreed("Labrodor");
		d1.setColor("black");
		d1.setName("browny");
		
		d2.setAge(2);
		d2.setBreed("pug");
		d2.setColor("cream");
		d2.setName("sonu");
		
		d3.setAge(3);
		d3.setBreed("dober man");
		d3.setColor("brown");
		d3.setName("spike");
		
		Dog [] dogs= {d1, d2, d3};
		
      	for(int i=0;i<dogs.length;i++) {
//			System.out.println("Age:"+dogs[i].getAge());
//			System.out.println("Breed:"+dogs[i].getBreed());
//			System.out.println("Color:"+dogs[i].getColor());
//			System.out.println("Name:"+dogs[i].getName());
      		System.out.println(dogs[i]);
			System.out.println("******************************");
		}
		System.out.println(d1.equals(d3));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
