package com.blc.elc;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(10,20));
		System.out.println(cal.sub(10,20));
		System.out.println(cal.mul(10,20));
		System.out.println(cal.div(10,20));
		System.out.println(cal.mod(10, 20));
	}
}
