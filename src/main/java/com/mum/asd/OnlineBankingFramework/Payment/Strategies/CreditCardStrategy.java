package com.mum.asd.OnlineBankingFramework.Payment.Strategies;

public class CreditCardStrategy implements IPaymentStrategy {

	private String name;
	private String cardNumber;
	private int cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String cardHolderName, String ccNumber, int cvv, String expiryDate) {
		this.name = cardHolderName;
		this.cardNumber = ccNumber;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + "$ Paid with credit card. Thank you :)");
	}
}
