package com.mum.asd.OnlineBankingFramework.shipping;

public class UspsStrategy implements IShippingStrategy {

	private double shippingRate = 2;
    private double orderWeight;

    public UspsStrategy(double orderWeight){
        this.orderWeight = orderWeight;
    }

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return orderWeight * shippingRate / 100;
	}

}
