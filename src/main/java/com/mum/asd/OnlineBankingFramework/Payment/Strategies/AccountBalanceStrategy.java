package com.mum.asd.OnlineBankingFramework.Payment.Strategies;

public class AccountBalanceStrategy implements IPaymentStrategy {

	private String accountNo;
	public AccountBalanceStrategy(String accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public void pay(double amount) {
		
		
		System.out.println(amount + "$ Deduct From account balance. Thank you :)");
	}

}
