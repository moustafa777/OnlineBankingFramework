package com.mum.asd.OnlineBankingFramework.models;

public class Item {
	private String itemName;
	private Integer quantity;
	private double price;
	
	

	public Item(String itemName, Integer quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
