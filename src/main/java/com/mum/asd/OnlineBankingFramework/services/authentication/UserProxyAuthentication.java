package com.mum.asd.OnlineBankingFramework.services.authentication;

import com.mum.asd.OnlineBankingFramework.models.User;

public class UserProxyAuthentication implements IAuthentication {

	UserAuthentication auth = new UserAuthentication();

	@Override
	public User IsAuthenticated(String userName, String password) {
		return auth.IsAuthenticated(userName, password);
	}

}
