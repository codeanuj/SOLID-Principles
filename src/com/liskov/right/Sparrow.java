package com.liskov.right;

public class Sparrow extends Bird implements Flyable {

	FlyingBehaviour fb=new FlyBehaviour();
	@Override
	public void fly() {
		fb.fly();
		
	}

}
