package com.jvm;

public class Example2 {
	public static void meth1() {
		meth2();
		System.out.println("Method 1");
	}
	public static void meth2() {
		System.out.println("Method - 2");
	}
	public static void main(String[] args) {
		meth1();
	}
}
