package com.liskov.right;

public class FlyBehaviour implements FlyingBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly");
	}

}
