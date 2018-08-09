package com.mum.asd.OnlineBankingFramework.models;

public class Transfer {

	private long transferNumber;
	private Account fromAccount;
	private Account destinationAccount;

	public long getTransferNumber() {
		return transferNumber;
	}

	public void setTransferNumber(long transferNumber) {
		this.transferNumber = transferNumber;
	}

	public Account getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Account getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

}
