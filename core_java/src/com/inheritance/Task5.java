package com.inheritance;

class Computer{
	public void showBrand() {
		System.out.println("Brand:Dell");
	}
}
class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model:XPS 15");
	}
}


public class Task5 {
	public static void main(String []args) {
		Laptop laptop=new Laptop();
		laptop.showModel();
		laptop.showBrand();
	}
}
