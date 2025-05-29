package com.employee;

import com.company.Company;

public class Employee {
	private String name, designation;
	private double salary;
	private Company company;

	private Employee(String name, String designation, double salary, Company company) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.company = company;
	}

	// getters
	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public Company getCompany() {
		return company;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", company=" + company
				+ "]";
	}

	public static Employee getEmployeeObject(String name, String designation, double salary, Company company) {
		return new Employee(name, designation, salary, company);
	}

}
