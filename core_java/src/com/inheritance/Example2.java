package com.inheritance;

class Employee{
	int id;
	String name;
	String desg;
	
	// John 
	public Employee(String name) {
		this(name , 100);
		System.out.println(this.name);
	}
	
	// John , 100 
	public Employee(String name , int id) {
		this(name , "unknown" , id);
		System.out.println("double parameterized");
	}
	
	// John , unknown , 100
	public Employee(String name , String desg , int id) {
		this.id = id;
		this.name = name;
		this.desg = desg;
		System.out.println("triple parameterized");
	}
	
	// new Employee(); // unknown , unknown , 1
	
	public Employee() {
		this("unknown" , "unknown" , 1);
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
}


public class Example2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee("John");
		System.out.println(employee1);
		
		System.out.println();
		
		Employee employee2 = new Employee("Sam" , 101);
		System.out.println(employee2);
		
		System.out.println();
		
		Employee employee3 = new Employee("Raghu" , "SD" , 104);
		System.out.println(employee3);
		System.out.println();
		
		employee3 = new Employee();
		System.out.println(employee3);
	}
}
