package com.mum.asd.OnlineBankingFramework.services;

import com.mum.asd.OnlineBankingFramework.services.serviceImpl.AccountServiceImpl;
import com.mum.asd.OnlineBankingFramework.services.serviceImpl.UserServiceImpl;;

public class ServiceFactory {

	public static IUserService getUserService() {

		return new UserServiceImpl();
	}

	public static  IAccountService getAccountService() {

		return new AccountServiceImpl();
	}

}
