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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (transferNumber ^ (transferNumber >>> 32));
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
		Transfer other = (Transfer) obj;
		if (transferNumber != other.transferNumber)
			return false;
		return true;
	}

}
