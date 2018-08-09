package com.mum.asd.OnlineBankingFramework.services.authentication;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.User;

public class UserAuthentication implements IAuthentication {

	UserAcountFacade userAcountFacade = new UserAcountFacade();

	@Override
	public User IsAuthenticated(String userName, String password) {
		return userAcountFacade.authenticateUser(userName, password);
	}
}
