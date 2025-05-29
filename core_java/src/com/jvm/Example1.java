package com.jvm;

public class Example1 {
	// ctrl + shift + f
	// ctrl + / 
	// alt + up or down 	
	// ctrl + 1 + enter 	
	public static void printDetails() {
		System.out.println("My Name is XYZ");
	}
	public String getData() {
		return "Hello World";
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		String result = obj.getData();
		System.out.println(result);
	}
}





