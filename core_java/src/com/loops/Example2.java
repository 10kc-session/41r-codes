package com.loops;

public class Example2 {

	public int sumOfNnaturalNumbers(int num) {
		if (num <= 0) {
			return -1;
		}
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int getFactorialOfNumber(int num) {
		if (num < 0)
			return -1;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public void printMultiplicationTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
	
	public String printName(int num , String name) {
		String result = "";
		for(int i = 1 ; i <= num ; i++) {
			result = result + name + "\n";
		}
		return result;
	}
	
	public void printAlphabets() {
		for(char ch = 'A'; ch <= 'Z' ; ch++) {
			System.out.println(ch + " - " + (int)ch);
		}
	}
	
	public int getPowerOfNumber(int base , int exp) {
		int result = 1; 
		for(int i = 1; i <= exp; i++) {
			result = result * base; 
		}
		return result;
	}

	public boolean isPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		
		System.out.println(obj.isPrime(13) ? "Prime Number" : "! Prime" );
		
		
		int result = obj.sumOfNnaturalNumbers(0);
		System.out.println("Sum : " + result);

		result = obj.getFactorialOfNumber(-1);
		System.out.println("Factorial Result : " + result);
		
		System.out.println("--------------------");
		
		obj.printMultiplicationTable(10);
		
		System.out.println("---------------------");
		
		System.out.println(obj.printName(5, "Java"));
		
		System.out.println("--------------------");
		
		obj.printAlphabets();
		
		System.out.println("------------------");
		
		System.out.println("Power of 2 ^ 5 : " + obj.getPowerOfNumber(2, 5) );

	}
}
