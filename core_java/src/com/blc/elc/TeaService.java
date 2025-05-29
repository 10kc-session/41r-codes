package com.blc.elc;

// BLC -> business logic class
public class TeaService {
	public static double price = 15;
	
	public double getTotalPrice(double quantity) {
		return price * quantity;
	}
	
}
