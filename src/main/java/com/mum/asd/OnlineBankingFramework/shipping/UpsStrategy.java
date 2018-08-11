package com.mum.asd.OnlineBankingFramework.shipping;

public class UpsStrategy implements IShippingStrategy {
	
	private double shippingRate = 7;
    private double orderWeight;

    public UpsStrategy(double orderWeight){
        this.orderWeight = orderWeight;
    }

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return orderWeight * shippingRate / 100;
	}

}
