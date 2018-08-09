package com.mum.asd.OnlineBankingFramework.service;

import com.mum.asd.OnlineBankingFramework.serviceImpl.UserServiceImpl;
import com.mum.asd.OnlineBankingFramework.serviceImpl.AccountServiceImpl;;


public class ServiceFactory {

	public IUserService getUserService() {
		
		return new UserServiceImpl();
	}
	
public IAccountService getAccountService() {
		
		return new AccountServiceImpl();
	}
	
}
