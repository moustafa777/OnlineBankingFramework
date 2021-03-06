package com.mum.asd.OnlineBankingFramework.transaction.subject;

import com.mum.asd.OnlineBankingFramework.models.Bill;
import com.mum.asd.OnlineBankingFramework.models.Transaction;
import com.mum.asd.OnlineBankingFramework.models.TransactionType;

public class PhoneBillSubject extends AbstractPaymentSubject {

	@Override
	public void payBill(Bill bill) {

		Transaction transaction = new Transaction();
		transaction.setAmount(bill.getBillAmount());
		transaction.setDescription("Phone Bill");
		transaction.setType(TransactionType.CREDIT);


		notifyObservers(transaction);

	}

}
