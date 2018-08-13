package com.mum.asd.OnlineBankingFramework.state;

import com.mum.asd.OnlineBankingFramework.models.Account;

public abstract class AccountState {
	
	protected double interestRate;
	protected double lowerLimit;
    protected double upperLimit;    
    public Account account;
    public double balance;
    
    public abstract boolean Deposit(double amount);
    public abstract double AccrueInterest();
    public abstract void TryStateChange();
    public abstract boolean Withdraw(double amount);    

}
