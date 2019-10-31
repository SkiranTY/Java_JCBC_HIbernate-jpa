package com.dev.threads;


public class Mainthread{

	public static void main(String[] args) {
		System.out.println("main thread started....");
		
		System.out.println("main thread printing the value of i");
		
		Thread2 t2=new Thread2();
		t2.setName("thread T2");
		t2.setPriority(1);               // set priority values 1-10 if value<0 throw exception
		t2.start();
		
		
		//new T2().start();                   //started the thread by creating the object
		
		//new T3().run();                   //calling method in T3
		
		//new Thread(new T3()).start();       // thread of runnable
		
		Thread.currentThread().setName("Main thread");
		Thread.currentThread().setPriority(2);
		
		Thread3 t3=new Thread3();
		Thread t=new Thread(t3);
		t.setName("Thread t3");
		t.setPriority(3);
		t.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("i= "+i);
		}
		
		System.out.println(t2.getName());
		System.out.println("Thread2 id: "+t2.getId());
		System.out.println("Thread2 priority: "+t2.getPriority());
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread priority: "+Thread.currentThread().getPriority());
		System.out.println("main thread id: "+Thread.currentThread().getId());
		
		System.out.println("Thread3 id: "+t.getId());
		System.out.println("Thread3 name: "+t.getName());
		System.out.println("Thread3 priority: "+t.getPriority());
		
		System.out.println("main thread terminated...");

	}

}
