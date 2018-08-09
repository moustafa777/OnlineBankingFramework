package com.mum.asd.OnlineBankingFramework.services;

import com.mum.asd.OnlineBankingFramework.services.serviceImpl.AccountServiceImpl;
import com.mum.asd.OnlineBankingFramework.services.serviceImpl.UserServiceImpl;;

public class ServiceFactory {

	public IUserService getUserService() {

		return new UserServiceImpl();
	}

	public IAccountService getAccountService() {

		return new AccountServiceImpl();
	}

}
