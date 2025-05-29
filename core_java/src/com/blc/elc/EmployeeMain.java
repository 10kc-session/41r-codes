package com.blc.elc;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee obj = new Employee();
		obj.setEmployeeDetailes("navya", "software developer", 100000.0);
		String res = obj.getEmployeeDetailes();
		System.out.println(res);
	}
}
