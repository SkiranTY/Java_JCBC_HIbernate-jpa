package com.dev.threads;

public class Thread4 extends Thread{

	Printer p;
	
	public Thread4(Printer pref) {
		p=pref;
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);            // to make the data consistence when 2 r more threads using the same reference
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.printval(10, "Thread4");
	}

}
