package com.oops.constructor;

public class Bike {
	String bikeName;
	String bikeModel;
	String yearOfManufacture;
	
	public Bike() {
		System.out.println("Non Parameterized..");
		bikeName = "none";
		bikeModel = "none";
		yearOfManufacture = "none";
	}
	
	public Bike(String bname , String bModel , String yom) {
		System.out.println("...Parameterized constructor...");
		bikeName = bname;
		bikeModel = bModel;
		yearOfManufacture = yom;
	}
	
	public void printData() {
		System.out.println(bikeName + " " + bikeModel + " " + yearOfManufacture);
	}
	
	public static void main(String[] args) {
		
		Bike bi = new Bike();
		bi.printData();
		
		System.out.println();
		
		Bike bike = new Bike("Himanlayan" , "2024" , "2023");
		bike.printData();
		
		System.out.println();
		
		Bike bike1 = new Bike("MT-15" , "2025" , "2023");
		bike1.printData();
	}
	
}
