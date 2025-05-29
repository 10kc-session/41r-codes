package com.blc.elc;

// ELC 
public class TeaMain {
	public static void main(String[] args) {
		TeaService service = new TeaService();
		System.out.println("Price of Tea : " + TeaService.price);
		double totalPrice = service.getTotalPrice(2.5);
		System.out.println("Total Price : " + totalPrice);
	}
}
