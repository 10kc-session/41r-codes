package com.encapsulation;

public class Car {
	private String brand;
	private String color;
	private double price;
	private Engine engine; // Has a relation
	
	public Car(String brand , String color, double price, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}
	
	// Getters 
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	// Setters 
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
	
}
