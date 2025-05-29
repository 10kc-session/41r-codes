package com.encapsulation;

public class Student {
	private String name;
	private int marks;
	
	public Student(String name , int marks) {
		this.name = name;
		setMarks(marks);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(int marks) {
		if(marks > 100 || marks < 0) {
			System.out.println("invalid marks");
			this.marks = 0;
		}else {
			this.marks = marks;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
}
