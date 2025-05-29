package com.oops.constructor;

public class Demo {
	int num;
	public Demo(int num) {
		this.num = num;
	}
	public Demo getObject() {
		return this; 
	}
	public String toString() {
		return "num : " + num;
	}
	public static void main(String[] args) {
		Demo demo = new Demo(100); 
		Demo demo2 = demo.getObject();
		System.out.println(demo);
		System.out.println(demo2);
		demo2.num = 500; 
		System.out.println("----after modification-----");
		System.out.println(demo);
		System.out.println(demo2);
	}
}



