package com.takeo;


public class SyncDemo {
	
	public static void main(String ... hand) {
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("count : "+c.count);
	}
}
