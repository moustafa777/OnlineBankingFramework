package com.mum.asd.OnlineBankingFramework.dao;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;

public class UserAcountFacade {

	private UserDAO userDAO;
	private AccountDAO accountDAO;

	public UserAcountFacade() {
		this.userDAO = DAOImpl.getUserDAO();
		this.accountDAO = DAOImpl.getAccountDAO();
	}

	public User findUser(long id) {
		return userDAO.find(id);
	}

	public User authenticateUser(String userName, String password) {
		return userDAO.findUser(userName, password);
	}

	public Account findAcount(long accountNumber) {
		return accountDAO.find(accountNumber);
	}

}
