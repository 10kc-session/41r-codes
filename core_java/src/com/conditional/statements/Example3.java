package com.conditional.statements;

public class Example3 {
	
	public static void main(String[] args) {
		int day = 9;
		switch(day) {
		case 1 : System.out.println("Sunday"); 
		case 2 : System.out.println("Monday");
		case 3 : System.out.println("Tuesday");
		default  : System.out.println("Invalid Day");
		case 4 : System.out.println("Wednesday");
		case 5 : System.out.println("Thursday"); 
		case 6 : System.out.println("Friday");  break;
		case 7 : System.out.println("Saturday");
		}
	}
}
