package com.encapsulation;

public class StudentReportDemo {
	public static void main(String[] args) {
		Student student = new Student("Jerry" , 90);
		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Marks : " + student.getMarks());
		
		student.setName("Jerry k");
		student.setMarks(98);
		
		System.out.println("-----Updated Name and Marks--------");
		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Marks : " + student.getMarks());
		
		System.out.println();
		System.out.println("----- Student 2 Marks---------");
		Student student2 = new Student("Ramu" , 123456);
		System.out.println("Student Name : " + student2.getName());
		System.out.println("Student Marks : " + student2.getMarks());
		
		
	}
}
