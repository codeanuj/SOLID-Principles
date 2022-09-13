package com.srp.oc.wrong;

public class Bird {
	String colour;
	String type;
	int age;
	
	
	void eat() {
		System.out.println("Bird Eat");
	}
	
	/**
	 * Violation of SRP as too much if else, bloated code
	 * violation of eay open close principle as this class should add only a new bird attributes and behaviour but when you add new bird you again modify fly()
	 * @param type
	 */
	void fly(String type) {
		if(type.equalsIgnoreCase("sparrow"))
			System.out.println("Fly slow");
		else if(type.equalsIgnoreCase("eagle"))
			System.out.println("Fly fast");
		else if(type.equalsIgnoreCase("penguin"))
			System.out.println("only walk");
		else System.out.println("No Fly");
	}
}
