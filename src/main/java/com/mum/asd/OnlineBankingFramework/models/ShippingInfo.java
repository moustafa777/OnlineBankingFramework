package com.mum.asd.OnlineBankingFramework.models;

public class ShippingInfo {
	
	public Address address;
	public String shippingMethod;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	
	

}
