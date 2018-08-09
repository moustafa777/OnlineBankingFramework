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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pillNumber ^ (pillNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pill other = (Pill) obj;
		if (pillNumber != other.pillNumber)
			return false;
		return true;
	}

}
