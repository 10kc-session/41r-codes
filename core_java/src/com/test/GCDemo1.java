package com.test;

class Display1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task-1 : " + i);
		} // end of loop
	}
}

class Display2 implements Runnable {
	public void run() {
		for (int i = 101; i <= 105; i++) {
			System.out.println("Task-2 : " + i);
		} // end of loop
	}
}

public class GCDemo1 {
	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display2 d2 = new Display2();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();// call run() from d1
		t2.start();// call run() from d2
	}
}
