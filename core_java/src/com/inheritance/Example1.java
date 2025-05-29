package com.inheritance;

// Parent class
class A {
	String message = "A class variable";
	public void method1() {
		System.out.println("A class method...");
	}
}
// Child class
class B extends A{
	public void method2() {
		System.out.println("B class Method");
	}
}
public class Example1 {
	public static void main(String[] args) {
		B b = new B(); // Child class object
		System.out.println(b.message);
		b.method1();
		b.method2();
		
		// Parent Object
		System.out.println();
		A a = new A(); // Parent class Object
		System.out.println(a.message);
		a.method1();
//		a.method2();
		
		// Child class object in parent class reference variable
		
		System.out.println();
		
		A a1 = new B(); // runtime
		System.out.println(a.message);
		a1.method1();
		
		
		// Parent class object into child class ref var
		
		System.out.println();
		
		
//		float f = 3.14f;
//		int i = (int)f;
//		System.out.println(i);
		
//		B b1 = new A();  // CE
//		B b1 = (B) new A(); // java.lang.ClassCastException
		
		A a2 = new B();
		B b2 = (B)a2;
		
		System.out.println(b2.message);
		b2.method1(); // parent class method
		b2.method2(); // child class method
	}
}






