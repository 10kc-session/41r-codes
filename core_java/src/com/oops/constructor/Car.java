package com.oops.constructor;

public class Car{
	
	String carName;
	String carModel;
	String yearOfManufacture;
	
	public void setCarData(String cname ,String cModel , String yom) {
		carName = cname;
		carModel = cModel;
		yearOfManufacture = yom;
	}
		
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("-------Default Values Given By Constructor--------");
		System.out.println("Car Name : " + car.carName);
		System.out.println("Car Model : " + car.carModel);
		System.out.println("YOM : " + car.yearOfManufacture);
		
		System.out.println();
		
		car.setCarData("Volvo", "xc90", "2006");
		
		System.out.println("----- After Assiging data through method---------");
		System.out.println("Car Name : " + car.carName);
		System.out.println("Car Model : " + car.carModel);
		System.out.println("YOM : " + car.yearOfManufacture);
		
	}
}
