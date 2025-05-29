package com.loops;

public class Example5 {

	public boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public void findFactorsAndPrime(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.findFactorsAndPrime(14);
	}
}
