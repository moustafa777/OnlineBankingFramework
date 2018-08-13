package com.mum.asd.OnlineBankingFramework.transaction.observer;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Transaction;
import com.mum.asd.OnlineBankingFramework.models.TransactionType;

public class TransactionObserverConcrete implements ITransactionObserver {

	@Override
	public void update(Transaction transaction) {

		UserAcountFacade userAcountFacade = new UserAcountFacade();

		Account account = userAcountFacade.getCurrentUser().getAccount();

		if (transaction.getType() == TransactionType.CREDIT) {
			account.setUserBalance(account.getUserBalance() - transaction.getAmount());
		} else {
			account.setUserBalance(account.getUserBalance() + transaction.getAmount());
		}

		transaction.setAcccountNumber(account.getAccountNumber());

		account.addTransaction(transaction);

	}

}
