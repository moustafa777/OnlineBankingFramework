package com.mum.asd.OnlineBankingFramework.models;

public class Pill {

	private long pillNumber;
	private double pillAmount;
	private String paidTo;

	public long getPillNumber() {
		return pillNumber;
	}

	public void setPillNumber(long pillNumber) {
		this.pillNumber = pillNumber;
	}

	public double getPillAmount() {
		return pillAmount;
	}

	public void setPillAmount(double pillAmount) {
		this.pillAmount = pillAmount;
	}

	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}

}
