package com.di.wrong;

public class Flipkart {
	
	/**
	 * Your flipkart class directly depends upon RazorPayAPI and if tomorrow RazorPayAPI gets closed you need to make all the changes in flipkart
	 */
	RazorPayAPI r=new RazorPayAPI();
	void pay() {
		r.enterCardDetails();
		r.enterName();
		r.enterCVV();
	}

}
