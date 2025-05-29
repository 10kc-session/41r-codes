package com.oops.constructor;

public class Bus {
	String busName;
	String busModel;
	String yearOfManufacture;
	
	public Bus() {
		System.out.println("Constructor invoked..");
		busName = "Volvo";
		busModel = "s9000";
		yearOfManufacture = "not available";
	}
	
	public void printData() {
		System.out.println(busName + " " + busModel + " " + yearOfManufacture);
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.printData();
		Bus bus1 = new Bus();
		bus1.printData();
		Bus bus2 = new Bus();
		bus2.printData();
		Bus bus3 = new Bus();
		bus3.printData();
		Bus bus4 = new Bus();
		bus4.printData();
	}
}
