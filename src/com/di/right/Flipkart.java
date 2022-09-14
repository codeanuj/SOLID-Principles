package com.di.right;

public class Flipkart {

	/**
	 * Now no matter what kind of payment service you want to use you need to create instance of adapter and it will take get take care of , no need to make changes in flipkart
	 * This can be more independent if we create a constructor and from there client will pass the value of payment method
	 */
	PaymentAPI api=new RazorPayAdapter();
	
	void pay() {
		api.enterCardDetails();
		api.enterName();
		api.enterCvv();
	}
}
