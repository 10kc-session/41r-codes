package com.oops.constructor;

public class Cat {
	String catName;
	String breed;
	int age;

	public Cat(String catName , String breed , int age) {
		this.catName = catName;
		this.breed = breed;
		this.age = age;
	}
	
	public String toString() {
		return "CatName = " + catName + ", Breed = " + breed + ", Age = " + age;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Manku" , "Persian" , 4); // 100x -> this
		System.out.println(cat);
	}
	
}

//		cat.setData(cat,"leo", "bengal tiger", 5);
//		cat.setData("leo", "bengal tiger", 5);
//public void setData(Cat cat, String catName , String breed , int age) {
//cat.catName = catName;
//cat.breed = breed;
//cat.age = age;
//}
//public void setData(String catName , String breed , int age) {
//this.catName = catName;
//this.breed = breed;
//this.age = age;
//}
