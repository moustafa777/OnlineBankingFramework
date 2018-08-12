package com.mum.asd.OnlineBankingFramework.Payment.Strategies;

import com.mum.asd.OnlineBankingFramework.shipping.IShippingStrategy;

public class Payment {

	private IPaymentStrategy strategy;

	public void setStrategy(IPaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void pay(double amount) {
		strategy.pay(amount);
	}
}
