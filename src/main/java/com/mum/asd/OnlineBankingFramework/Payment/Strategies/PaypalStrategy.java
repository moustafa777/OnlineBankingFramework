package com.mum.asd.OnlineBankingFramework.Payment.Strategies;

public class PaypalStrategy implements IPaymentStrategy {

	private String email;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.email = email;
		this.password = pwd;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + "$ Paid using your Paypal.");
	}

}
