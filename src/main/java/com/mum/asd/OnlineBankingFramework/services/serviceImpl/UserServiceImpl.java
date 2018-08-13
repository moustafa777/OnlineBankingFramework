package com.mum.asd.OnlineBankingFramework.services.serviceImpl;

import com.mum.asd.OnlineBankingFramework.dao.UserAcountFacade;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.IUserService;

public class UserServiceImpl implements IUserService {

	UserAcountFacade userAcountFacade;

	@Override
	public void createUSer(User user) {
		userAcountFacade = new UserAcountFacade();

		userAcountFacade.addUser(user);

	}

	@Override
	public User findUser(String userName, String password) {
		userAcountFacade = new UserAcountFacade();

		return userAcountFacade.authenticateUser(userName, password);
	}

}
