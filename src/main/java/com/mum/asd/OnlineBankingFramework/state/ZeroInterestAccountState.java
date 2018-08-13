package com.mum.asd.OnlineBankingFramework.state;

import com.mum.asd.OnlineBankingFramework.models.Account;

public class ZeroInterestAccountState extends AccountState {

	private final double interestRate = 0;
	private final double lowerLimit = 0;
	private final double upperLimit = 1000;

	public ZeroInterestAccountState(AccountState accountState) {
		super();
	}

	public ZeroInterestAccountState(double balance, Account account) {
		this.balance = balance;
		this.account = account;
	}

	@Override
	public boolean Deposit(double amount) {
		balance += amount;
		TryStateChange();
		return true;
	}

	@Override
	public double AccrueInterest() {
		double accruedInterest = interestRate * balance;
		balance += accruedInterest;
		TryStateChange();
		return accruedInterest;

	}

	@Override
	public void TryStateChange() {
		if (balance < lowerLimit)
        {
            account.setAccountState(new OverdrawnAccountState(this));
        }
        else if (balance > upperLimit)
        {
        	account.setAccountState(new InterestAccountState(this));
        }

	}

	@Override
	public boolean Withdraw(double amount) {
		balance -= amount;
        TryStateChange();
        return true;
	}

}
