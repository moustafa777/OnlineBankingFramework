package com.mum.asd.OnlineBankingFramework.models;

import java.util.List;

public class Account {

	private long accountNumber;
	private User user;
	private double userBalance;
	private List<Pill> paidPills;
	private List<Transfer> userTransfers;

	public Account() {
	}

	public Account(long accountNumber, double userBalance) {
		this.accountNumber = accountNumber;
		this.userBalance = userBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}

	public List<Pill> getPaidPills() {
		return paidPills;
	}

	public void setPaidPills(List<Pill> paidPills) {
		this.paidPills = paidPills;
	}

	public List<Transfer> getUserTransfers() {
		return userTransfers;
	}

	public void setUserTransfers(List<Transfer> userTransfers) {
		this.userTransfers = userTransfers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

}
