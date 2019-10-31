package com.dev.encapsulation;

public class Petdata {

	
	public static void main(String []args) {
		//for dogs
	Pets d=new Pets();
	Pets d1=new Pets();
	Pets d2=new Pets();
	
	//for cats
	Pets c=new Pets();
	Pets c1=new Pets();
	Pets c2=new Pets();
	
	//for birds
	Pets b=new Pets();
	Pets b1=new Pets();
	Pets b2=new Pets();
	
	
	//for dogs
	d.setAge(1);
	d.setName("pinky");
	d.setBreed("labrodor");
	d.setColor("brown");
	
	d1.setAge(2);
	d1.setName("sonu");
	d1.setBreed("pug");
	d1.setColor("cream");
	
	d2.setAge(1);
	d2.setName("rosi");
	d2.setBreed("labrodor");
	d2.setColor("white");
	
	
	//for cats
	c.setAge(2);
	c.setName("pussy");
	c.setColor("white");
	
	c1.setAge(1);
	c1.setName("tom");
	c1.setColor("gold");
	
	c2.setAge(3);
	c2.setName("jerry");
	c2.setColor("brown");
	
	//for birds
	b.setAge(1);
	b.setName("bunny");
	b.setType("parrot");
	
	b1.setAge(2);
	b1.setName("moni");
	b1.setType("peacock");
	
	b2.setAge(3);
	b2.setName("pari");
	b2.setType("piegeon");
	
	
	Pets [] dogs= {d,d1,d2};
	Pets [] cats= {c,c1,c2};
	Pets [] birds= {b,b1,b2};
	
	
	System.out.println("Dogs");
	System.out.println();
	for(int i=0;i<dogs.length;i++) {
//		System.out.println("Age:"+dogs[i].getAge());     //if not using tostring in bean class
//		System.out.println("Name:"+dogs[i].getName());
//		System.out.println("color:"+dogs[i].getColor());
//		System.out.println("breed:"+dogs[i].getBreed());
		System.out.println(dogs[i]);                         // if tostring is used
		System.out.println("*****************************");
	}
	
	System.out.println("cats");
	System.out.println();
	for(int i=0;i<dogs.length;i++) {
		System.out.println("Age:"+cats[i].getAge());
		System.out.println("Name:"+cats[i].getName());
		System.out.println("color:"+cats[i].getColor());
		System.out.println("*****************************");
	}
	
	System.out.println("birds");
	System.out.println();
	for(int i=0;i<dogs.length;i++) {
		System.out.println("Age:"+birds[i].getAge());
		System.out.println("Name:"+birds[i].getName());
		System.out.println("type:"+birds[i].getType());
		System.out.println("*****************************");
	}
	}
}
