package com.srp.oc.right;

public class Sparrow extends Bird implements Flyable{
	FlyingBehaviour fb = new SlowFlyingBehaviour();

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		fb.fly();
		
	}
	

}
