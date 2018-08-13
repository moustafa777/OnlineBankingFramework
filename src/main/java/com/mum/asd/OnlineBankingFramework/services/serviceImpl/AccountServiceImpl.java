package com.mum.asd.OnlineBankingFramework.services.serviceImpl;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Bill;
import com.mum.asd.OnlineBankingFramework.models.Transfer;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.IAccountService;
import com.mum.asd.OnlineBankingFramework.transaction.observer.TransactionObserverConcrete;
import com.mum.asd.OnlineBankingFramework.transaction.subject.InternetBillSubject;
import com.mum.asd.OnlineBankingFramework.transaction.subject.PhoneBillSubject;
import com.mum.asd.OnlineBankingFramework.transaction.subject.UtilityBillSubject;

public class AccountServiceImpl implements IAccountService {
	UserAcountFacade userAcountFacade;

	@Override
	public Transfer transferFund(Transfer transfer) {
		return null;
	}

	@Override
	public void payBill(Bill bill) {

		if (bill.getType().equals("UB")) {

			UtilityBillSubject utilityBillSubject = new UtilityBillSubject();
			utilityBillSubject.attach(new TransactionObserverConcrete());

			utilityBillSubject.payBill(bill);

		} else if (bill.getType().equals("PB")) {

			PhoneBillSubject phoneBillSubject = new PhoneBillSubject();

			phoneBillSubject.attach(new TransactionObserverConcrete());
			phoneBillSubject.payBill(bill);

		} else if (bill.getType().equals("IB")) {

			InternetBillSubject internetBillSubject = new InternetBillSubject();
			internetBillSubject.attach(new TransactionObserverConcrete());

			internetBillSubject.payBill(bill);
		}

	}

	@Override
	public Account viewAccountDetails(User user) {
		userAcountFacade = new UserAcountFacade();

		return userAcountFacade.viewAccountDetails(user);

	}
}
