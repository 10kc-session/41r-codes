package com.conditional.statements;

public class Example1 {
	/**
	 * Write a java program to find largest number b/w a and b if a is greater b ,
	 * print A is Largest Number if b is greater a , print B is Largest Number
	 * 
	 *  write a java program to find weather number is even or odd
	 *  
	 *  write a java program to find the largest number b/w a , b , c 
	 *  if a is greater b and c -> A is largest
	 *  if b is greater a and c -> B is Largest
	 *  if c is greater a and b -> C is largest
	 *  
	 */

	public static void main(String[] args) {
		
		int a1 = 10;
		int b1 = 10;
		int c1 = 10;
		
		if(a1 > b1 && a1 > c1) {
			System.out.println("A is Largest");
		}else {
			if(b1 > a1 && b1 > c1) {
				System.out.println("B is Largest");
			}else {
				System.out.println("C is largest");
			}
		}
		
		
		
		
		int num = 5;
		
		if(num == 0) {
			System.out.println("Zero Number..");
		}
		else {
			if(num % 2 == 0) {
				System.out.println("Even Number...");
			}else {
				System.out.println("Odd Number...");
			}
		}
		

		int a = 20;
		int b = 20;

		if (a > b) 
		{
			System.out.println("A is Largest");
		} 
		else {
			if (a == b) {
				System.out.println("Both are equal");
			} else {
				System.out.println("B is largest");
			}
		}

		if (a > b) {
			System.out.println("A is Largest");
		} else {
			System.out.println("B is Largest");
		}

		int age = 16;
		if (age >= 18) {
			System.out.println("Eligible for voting...");
		} else {
			System.out.println("! Eligible for voting.");
		}
	}
}
