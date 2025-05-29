package com.inheritance;

class Vehiclee{
	public void describe() {
		System.out.println("This is a vehicle");
	}
}

class Car1 extends Vehiclee{
	public void describe() {
		super.describe();
		System.out.println("This is a car");
	}
}

public class Task6 {
	public static void main(String[] args) {
		new Car1().describe();
	}
}
