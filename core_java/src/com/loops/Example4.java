package com.loops;

public class Example4 {
	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

		// write a java program to print 1 to 10 in reverse order

		i = 10;
		do {
			System.out.println(i--);
		} while (i >= 1);

		// write a java program to print find even numbers from given
		// digit -> 1245369
		// output -> 6 4 2

		i = 1245369;

		// 1245369 % 10 -> 9 -> even -> 1245369/10 -> 124536% 10 -> 6 -> even -> print
		System.out.println("-------------------");
		do {
			if ((i % 10) % 2 == 0) {
				System.out.println(i % 10);
			}
			i /= 10;
		} while (i != 0);

		/**
		 * write a java program to find number is amstrong or not using while loop and
		 * digits should in between 100 and 999
		 * 
		 * i/p : 153 -> 1 ^ 3 + 5 ^ 3 + 3 ^ 3 142 -> 1 ^ 3 + 4 ^ 3 + 2 ^ 3 -> 8 + 64 + 1
		 * o/p : Amstrong Number
		 * 
		 * 153 % 10 -> 3 * 3 * 3 -> 27 -> sum -> 153 / 10 -> 15 % 10 -> 5 * 5 * 5 -> 125
		 * -> sum
		 */

		i = 153;
		if (i >= 100 && i <= 999) {
			int temp = i;
			int sum = 0;
			while (i > 0) {
				int rem = i % 10;
				sum += (rem * rem * rem);
				i /= 10;
			}
			System.out.println((temp == sum) ? "Amstrong Number" : "Not Amstrong.");
		}else {
			System.out.println("Number should be b/w 100 and 999");
		}

	}
}
