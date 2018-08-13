package com.mum.asd.OnlineBankingFramework.models;

public class Transaction {

	private String type;
	private String description;
	private double currentBalance;
	private long acccountNumber;
	private double amount;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public long getAcccountNumber() {
		return acccountNumber;
	}
	public void setAcccountNumber(long acccountNumber) {
		this.acccountNumber = acccountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
