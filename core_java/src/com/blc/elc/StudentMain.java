package com.blc.elc;



public class StudentMain {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Nithin";
		student1.address = "Suryapet";
		student1.phno = 123456789;
		String student1Data = student1.getData();
		System.out.println(student1Data);
		student1.reading();
		student1.writting();
	}
}
