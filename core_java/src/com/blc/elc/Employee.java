package com.blc.elc;

public class Employee {
	private String employeName;
	private String designation;
	private double salary;

	public void setEmployeeDetailes(String name, String desg, double sal) {
		employeName = name;
		designation = desg;
		salary = sal;
	}

	public String getEmployeeDetailes() {
		return "Employee Name:" + employeName + "\nEmployee Salary:" + salary + "\nEmployee designation:" + designation;
	}
}
