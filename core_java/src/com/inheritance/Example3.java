package com.inheritance;

class GrandParent{
	public GrandParent() {
		System.out.println("grand parent");
	}
}
class Parent extends GrandParent{
	public Parent() {
		System.out.println("parent");
	}
	Parent(String name){
		System.out.println(name);
	}
}
class Child extends Parent{
	public Child() {
		super("Hey There");
		System.out.println("child");
	}
	public Child(String name){
		this();
		System.out.println(name);
	}
}
public class Example3 {
	public static void main(String[] args) {
		new Child("Java is Awesome...");
	}
}

