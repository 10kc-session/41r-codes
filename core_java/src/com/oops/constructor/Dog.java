package com.oops.constructor;

public class Dog {
	String name;
	String breed;
	double monthlyCost;

	public Dog(String nm, String br, double mc) {
		name = nm;
		breed = br;
		monthlyCost = mc;
	}

	public String toString() {
		return "[name = " + name + ", breed = " + breed + ", monthly cost = " + monthlyCost + "]";
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("Tommy", "Indie", 500);
		System.out.println(dog1); // dog1.toString();
		
		Dog dog2 = new Dog("Chintu" , "Dabur Man" , 8000);
		System.out.println(dog2);
		
	}
}
