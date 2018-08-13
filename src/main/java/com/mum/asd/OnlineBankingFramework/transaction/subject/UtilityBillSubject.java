package com.mum.asd.OnlineBankingFramework.transaction.subject;

import java.util.ArrayList;
import java.util.List;

import com.mum.asd.OnlineBankingFramework.transaction.observer.ITransactionObserver;

public class UtilityBillSubject extends AbstractPaymentSubject {


	
	public void UutilityBill() {
		
		// do some business
		notifyObservers();
	}

}
