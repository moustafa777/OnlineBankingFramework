package com.mum.asd.OnlineBankingFramework.state;

import com.mum.asd.OnlineBankingFramework.models.Account;

public class InterestAccountState extends AccountState {
	
	private final double interestRate = 0.05;
    private final double lowerLimit = 1000;
    private final double upperLimit = 1000000;
    
    public InterestAccountState(AccountState accountState) {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterestAccountState(double balance, Account account)
    {
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
		if (balance < 0.0)
        {
			account.setAccountState(new OverdrawnAccountState(this));
        }
        else if (balance < lowerLimit)
        {			
        	account.setAccountState(new ZeroInterestAccountState(this));        	
        }

	}

	@Override
	public boolean Withdraw(double amount) {
		 balance -= amount;
         TryStateChange();
         return true;
	}

}
