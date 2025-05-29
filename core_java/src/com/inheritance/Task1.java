package com.inheritance;

class Animal {
	public void display() {
		System.out.println("This is Animal");
	}
}

class Dog extends Animal{
	public void eating() {
		System.out.println("Dog is eating.");
	}
}

public class Task1 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.display();
		((Dog)dog).eating();
	}
}






