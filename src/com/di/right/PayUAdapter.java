package com.di.right;

public class PayUAdapter implements PaymentAPI {

	PayUAPI payu= new PayUAPI();
	@Override
	public void enterCardDetails() {
		// TODO Auto-generated method stub
		payu.enterDetails();
		
	}

	@Override
	public void enterName() {
		// TODO Auto-generated method stub
		payu.enterCardHolderName();
		
	}

	@Override
	public void enterCvv() {
		// TODO Auto-generated method stub
		payu.enterCardCvv();
		
	}

}
