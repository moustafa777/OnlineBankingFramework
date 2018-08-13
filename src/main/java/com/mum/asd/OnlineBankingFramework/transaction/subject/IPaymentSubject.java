package com.mum.asd.OnlineBankingFramework.transaction.subject;

import com.mum.asd.OnlineBankingFramework.transaction.observer.ITransactionObserver;

public interface IPaymentSubject {

	public void attach(ITransactionObserver observer);
	public void detach(ITransactionObserver observer);
	public void notifyObservers();
}
