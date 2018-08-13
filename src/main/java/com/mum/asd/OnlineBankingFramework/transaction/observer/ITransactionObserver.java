package com.mum.asd.OnlineBankingFramework.transaction.observer;

import com.mum.asd.OnlineBankingFramework.models.Transaction;

public interface ITransactionObserver {

	public void update(Transaction transaction);

}
