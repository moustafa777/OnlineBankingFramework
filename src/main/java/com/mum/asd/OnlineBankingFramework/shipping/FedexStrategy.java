package com.mum.asd.OnlineBankingFramework.shipping;

public class FedexStrategy implements IShippingStrategy {

	private double shippingRate = 5;
	private double orderWeight;

	public FedexStrategy(double orderWeight) {
		this.orderWeight = orderWeight;
	}

	@Override
	public double calculate() {
		return orderWeight * shippingRate / 100;
	}

}
