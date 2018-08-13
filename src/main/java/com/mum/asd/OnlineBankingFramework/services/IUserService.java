package com.mum.asd.OnlineBankingFramework.services;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface IUserService {

	void createUSer(User user);
	
	User findUser(String userName, String password);
	
	
}
