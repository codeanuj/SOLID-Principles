package com.srp.oc.right;

public class Penguin extends Bird implements Runnable{
    RunningBehaviour rb = new SlowRunningBehaviour();
	@Override
	public void run() {
		rb.run();	
	}

}
