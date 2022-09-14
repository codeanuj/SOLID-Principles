package com.liskov.right;

public class Eagle extends Bird implements Flyable{

	FlyingBehaviour fb=new FlyBehaviour();
	@Override
	public void fly() {
		fb.fly();	
	}

}
