package com.conditional.statements;

public class Example2 {
	
	public static void printEvenOddZero(int num)
	{
//		System.out.println((num % 2 == 0) ? "Even Number.." : "Odd Number..");
		String result = (num == 0) ? "Zero" : (num % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println(result);
	}
	
	public static void getLargestOfThreeNumbers(int a , int b , int c) {
		String result = (a == b && b == c) ? "All are equal" : 
						(a > b && a > c) ? "A is Largest" : 
						(b > c) ? "B is largest" : "C is largest";
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		getLargestOfThreeNumbers(20, 50, 60);
		
		
		
		printEvenOddZero(89);
		
		
		int num = 41;
		// variable variableName = (condition) ? true : false
		String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println(result);
		
		System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");
		
		int a = 30 , b = 40;
		
		int res = (a > b) ? a : b;
		System.out.println("Largest Number " + res);
		System.out.println("Largest Number " + ((a > b) ? a : b));
	}
}


