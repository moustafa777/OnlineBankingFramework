package com.mum.asd.OnlineBankingFramework.shipping;

public class PackageShipping {

	private IShippingStrategy strategy;

	public void setStrategy(IShippingStrategy strategy) {
		this.strategy = strategy;
	}

	public double calculateShippingFee() {
		return strategy.calculate();
	}

}
