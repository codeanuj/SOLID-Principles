package com.srp.oc.right;

public class Eagle extends Bird implements Flyable{
    FlyingBehaviour fb = new FastFlyingBehaviour();
	@Override
	public void fly() {
		fb.fly();
		
	}

}
