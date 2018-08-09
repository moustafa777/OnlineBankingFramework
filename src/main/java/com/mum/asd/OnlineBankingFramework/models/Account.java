package com.mum.asd.OnlineBankingFramework.models;

import java.util.List;

public class Account {

	private long id;
	private long accountNumber;
	private User user;
	private double userBalance;
	private List<Pill> paidPills;
	private List<Transfer> userTransfers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
