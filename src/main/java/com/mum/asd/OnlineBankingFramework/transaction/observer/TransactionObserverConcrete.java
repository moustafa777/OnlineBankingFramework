package com.mum.asd.OnlineBankingFramework.transaction.observer;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Transaction;

public class TransactionObserverConcrete implements ITransactionObserver {

	@Override
	public void update(Transaction transaction) {

		UserAcountFacade userAcountFacade = new UserAcountFacade();

		Account account = userAcountFacade.getCurrentUser().getAccount();

		transaction.setAcccountNumber(account.getAccountNumber());

		account.addTransaction(transaction);

	}

}
