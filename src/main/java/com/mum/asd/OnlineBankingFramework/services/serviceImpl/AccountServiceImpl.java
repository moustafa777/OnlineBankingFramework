package com.mum.asd.OnlineBankingFramework.services.serviceImpl;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.Pill;
import com.mum.asd.OnlineBankingFramework.models.Transfer;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.IAccountService;

public class AccountServiceImpl implements IAccountService {
	UserAcountFacade userAcountFacade;

	@Override
	public Transfer transferFund(Transfer transfer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long payBill(User user, Pill pill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Account viewAccountDetails(User user) {
		userAcountFacade = new UserAcountFacade();

		return userAcountFacade.viewAccountDetails(user);

	}
}
