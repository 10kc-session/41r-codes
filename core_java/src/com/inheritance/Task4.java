package com.inheritance;

class Employee1{
	int salary = 50000;
}
class Manager extends Employee1  {
	int bonus = 20000;
}

public class Task4 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.salary + manager.bonus);
	}
}
