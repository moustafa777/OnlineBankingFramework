package com.mum.asd.OnlineBankingFramework.transaction.subject;

import java.util.ArrayList;
import java.util.List;

import com.mum.asd.OnlineBankingFramework.transaction.observer.ITransactionObserver;

public class AbstractPaymentSubject  implements IPaymentSubject{

	
	private List<ITransactionObserver> observers;

	public AbstractPaymentSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void attach(ITransactionObserver observer) {

		if (!observers.contains(observer))
			observers.add(observer);

	}

	@Override
	public void detach(ITransactionObserver observer) {
		int i = observers.indexOf(observer);
		if (i >= 0)
			observers.remove(i);

	}


	@Override
	public void notifyObservers() {

		int n = observers.size();
		for (int i = 0; i < n; ++i) {
			ITransactionObserver observer = (ITransactionObserver) observers.get(i);
			observer.update();
		}

	}
}
