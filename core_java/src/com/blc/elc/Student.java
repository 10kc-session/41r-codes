package com.blc.elc;

public class Student {
	String name;
	String address;
	long phno;

	public String getData() {
		return "my name is " + name + "\nmy address is " + address + "\nmy phno is " + phno;
	}

	public void reading() {
		System.out.println(name + " is currently reading.");
	}

	public void writting() {
		System.out.println(name + " is currently writting.");
	}
}
