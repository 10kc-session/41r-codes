package com.loops;

public class Example1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println("Hello World");
		}

		System.out.println("--------------------");

		// i = i + 1
		for (int i = 1; i <= 100; i++) {
			System.out.println("Java is Awesome " + i);
		}

		System.out.println("--------------------");

		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println(i);
		}

		// Write a java program to find even number from
		// 2 to 100 without conditional statements

		System.out.println("-------------------");

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println(i);
		}

		/**
		 * Write a java program to print odd number from 1 to 100 without conditional
		 * statements
		 */

		System.out.println("--------------------------");

		for (int i = 1; i <= 100; i = i + 2) {
			System.out.println(i);
		}

		/**
		 * Write a java program to print numbers in below format expected o/p : 1 2 3 4
		 * 5 6 7 8 9 10
		 */
		System.out.println("-----------------");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		/**
		 * Write a java program to print in below format 
		 * Expected out : Even Numbers : 2 4 6 8 10 ... 100 
		 * without third variable.
		 */
		
		System.out.println();
		System.out.println("-----------------");
		
		System.out.print("Even Numbers : ");
		for(int i = 2 ; i <= 100 ; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		System.out.print("Odd Numbers : ");
		for(int i = 1 ; i <= 100 ; i = i + 2) {
			System.out.print(i + " ");
		}
		
		

	}
}
