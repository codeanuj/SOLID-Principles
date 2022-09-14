package com.liskov.wrong;

public class Penguin extends Bird {

	@Override
	void fly() {
		System.out.println("can't fly");

	}

}
