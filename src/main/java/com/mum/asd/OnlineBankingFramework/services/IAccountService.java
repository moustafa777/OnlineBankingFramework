package com.mum.asd.OnlineBankingFramework.services;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Bill;
import com.mum.asd.OnlineBankingFramework.models.Transfer;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface IAccountService {

	Transfer transferFund(Transfer transfer);

	// creatStatement()

	void payBill(Bill bill);

	Account viewAccountDetails(User user);
}
