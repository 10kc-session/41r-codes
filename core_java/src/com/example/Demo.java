package com.example;

public class Demo {
	String name;
	public String getString() {
		System.out.println("Hello World....");
		return name;
	}
	public static int meth1() {
		String str = "Java is awesome";
		System.out.println(new Demo().getString());
		return str.length();
	}
	public void displayData() {
		System.out.println(getString());
		System.out.println(meth1());
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.name = "Yoo";
		demo.displayData();
	}
	
}
