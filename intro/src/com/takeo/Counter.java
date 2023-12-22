package com.takeo;

public class Counter {
	int count;
	public synchronized void increment() {
		count++;
	}
}
