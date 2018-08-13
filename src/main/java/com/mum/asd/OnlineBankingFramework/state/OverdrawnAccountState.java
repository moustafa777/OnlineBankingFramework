package com.mum.asd.OnlineBankingFramework.state;

import java.io.Console;

public class OverdrawnAccountState extends AccountState {

	private final double interestRate = 0;
    private final double lowerLimit = 1000;
    private final double upperLimit = 0;
    
    public OverdrawnAccountState(AccountState accountState)
    {
        this.balance = accountState.balance;
        this.account = accountState.account;
    }
    
	@Override
	public boolean Deposit(double amount) {
		balance += amount;
        TryStateChange();
        return true;
	}

	@Override
	public double AccrueInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void TryStateChange() {
		if (balance > upperLimit)
        {
        	account.setAccountState(new ZeroInterestAccountState(this));        	
        }

	}

	@Override
	public boolean Withdraw(double amount) {
		System.out.println("ALERT: Unable to withdraw "+ amount +" due to lack of funds.");
        // Withdrawal failed.
        return false;
	}

}
