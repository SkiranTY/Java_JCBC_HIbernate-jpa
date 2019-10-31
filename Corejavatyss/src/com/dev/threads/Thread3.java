package com.dev.threads;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("T3 the thread starts....");
		
		System.out.println("thread t3 printing the value of k");
		
		for (int k=10;k>=0;k--) {
			System.out.println("k="+k);
		}
		System.out.println("T3 the thread terminated");
	}
}
