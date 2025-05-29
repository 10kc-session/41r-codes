package com.encapsulation;

public class CarManufacture {
	public static void main(String[] args) {
		Engine engine = new Engine("1400cc" , "250bhp" , "14kmpl");
		Car car = new Car("volkswagen" , "red" , 160000.345 , engine);
		System.out.println(car);
		
		car.setColor("black");
		car.setPrice(car.getPrice() + 10000);
		
		Engine newEngine = new Engine("1500cc" , "300bhp" , "10kmpl");
		
		car.setEngine(newEngine);
		
		System.out.println();
		
		System.out.println(car);
		
		System.out.println("-----------------------");
		
		car.getEngine().setMielage("7kmpl");
		
		System.out.println(car);
		
	}
}
