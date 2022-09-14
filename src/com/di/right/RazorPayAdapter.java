package com.di.right;

public class RazorPayAdapter implements PaymentAPI{

	RazorPayAPI razorPay = new RazorPayAPI();
	@Override
	public void enterCardDetails() {
		// TODO Auto-generated method stub
		razorPay.enterCardDetails();
	}

	@Override
	public void enterName() {
		// TODO Auto-generated method stub
		razorPay.enterName();
	}

	@Override
	public void enterCvv() {
		// TODO Auto-generated method stub
		razorPay.enterCVV();
	}

}
