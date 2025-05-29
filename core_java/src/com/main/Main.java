package com.main;

import com.employee.Employee;
import com.company.Company;

public class Main {
	public static void main(String[] args) {
		Company companyObject = Company.getCompanyObject("TCS", "India", "3 months NP");
		Employee employeeObject = Employee.getEmployeeObject("Rajesh", "SD", 1234567, companyObject);
		
		System.out.println(employeeObject);
		System.out.println(companyObject);
		
	}
}
