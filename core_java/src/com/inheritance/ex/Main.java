package com.inheritance.ex;

class Vehicle{
	// Common properties
	private String name;
	private double price;
	private String model;
	private long yearOfManufacture;
	
	public void horn() {
		System.out.println("tuk tuk...");
	}
	
	public Vehicle(String name, double price, String model, long yearOfManufacture) {
		this.name = name;
		this.price = price;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(long yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + ", model=" + model + ", yearOfManufacture="
				+ yearOfManufacture + "]";
	}
}
class Car extends Vehicle{
	private String brand;
	private long noOfDoors;
	
	public Car(String name , double price, String model , long yearOfManufacture, String brand , long noOfDoors) {
		super(name , price , model , yearOfManufacture);
		this.brand = brand;
		this.noOfDoors = noOfDoors;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(long noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public String toString() {
		return "Car [brand=" + brand + ", noOfDoors=" + noOfDoors + ", getName()=" + getName() + ", getPrice()="
				+ super.getPrice() + ", getModel()=" + getModel() + ", getYearOfManufacture()=" + getYearOfManufacture()
				+ "]";
	}
}

class Truck extends Vehicle{
	private String capacity;
	private String type;
	
	public Truck(String name, double price, String model, long yearOfManufacture , String capacity , String type) {
		super(name , price , model , yearOfManufacture);
		this.capacity = capacity;
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Truck [capacity=" + capacity + ", type=" + type + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getModel()=" + getModel() + ", getYearOfManufacture()=" + getYearOfManufacture()
				+ "]";
	}
	
}



public class Main {
	public static void main(String[] args) {
		Vehicle vehicle;
		
		vehicle = new Car("xyz", 160000, "hexa", 2015, "Tata", 4);
		System.out.println(vehicle);
		
		vehicle = new Truck("chintu", 450000, "DCM", 2000, "2000 tons", "DCM");
		System.out.println(vehicle);
		
	}
}









