package com.inheritance;


class Vehicle {
	String name = "Tata";
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle{
	String name = "Volvo";
	public void speed() {
		super.run();
		System.out.println("Car is moving at 80kmph");
		System.out.println(super.name);
	}
}

public class Task2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.speed();
	}
}




