package com.mum.asd.OnlineBankingFramework.services.authentication;

import com.mum.asd.OnlineBankingFramework.models.User;

public interface IAuthentication {

	User IsAuthenticated(String userName, String password);
}
