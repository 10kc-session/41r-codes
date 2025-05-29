package com.loops;

public class Example3 {
	public static void main(String[] args) {
		/**
		 * 	while(condition){
		 * 		// statements
		 *  }
		 */
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("----------------");
		
		i = 1;
		while(++i <= 8) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println(i);
		
		System.out.println("----------------");
		
		// Print number in reverse order
		// i/p : 1234 
		// o/p : 4321
		
		i = 554321;
		
		while(i != 0) {
			System.out.print(i % 10);
			i = i / 10;
		}
		
		// write a java program to find number is
		// palindrome or not 
		
		// 121 reverse 121 
		// 123 reverse 321
		// 141 reverse 141 
		
		int num = 123; // 121
		
		int temp = num; // 121
		
		int rev = 0;
		
		// 142241
		
		while(num != 0) {
			rev = rev * 10 + (num % 10);
			num = num/10;
		}
		System.out.println();
		System.out.println((temp == rev) ? "Palindrome" : "Not Palindrome");
		
		
		
		
		
		
	}
}







