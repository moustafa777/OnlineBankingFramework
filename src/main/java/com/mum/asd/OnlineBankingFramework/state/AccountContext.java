package com.mum.asd.OnlineBankingFramework.state;

public class AccountContext extends AccountState {

	private AccountState state;
	
	
	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	@Override
	public boolean Deposit(double amount) {
		return state.Deposit(amount);
	}

	@Override
	public double AccrueInterest() {
		return state.AccrueInterest();
	}

	@Override
	public void TryStateChange() {
		state.TryStateChange();

	}

	@Override
	public boolean Withdraw(double amount) {
		return state.Withdraw(amount);
	}

}
