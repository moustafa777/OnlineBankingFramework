package com.mum.asd.OnlineBankingFramework.services;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Pill;
import com.mum.asd.OnlineBankingFramework.models.Transfer;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface IAccountService {

	Transfer transferFund(Transfer transfer);
	
	//creatStatement()
	
	long payBill(User user, Pill pill);
	
	
	Account viewAccountDetails(User user);
	
}
