package com.mum.asd.OnlineBankingFramework.dao;

public class DAOImpl {

	private static UserDAO userDAO;
	private static AccountDAO accountDAO;

	
	
	public static void setUserDAO(UserDAO userDAO) {
		DAOImpl.userDAO = userDAO;
	}

	public static void setAccountDAO(AccountDAO accountDAO) {
		DAOImpl.accountDAO = accountDAO;
	}

	public static UserDAO getUserDAO() {
		return userDAO;
	}

	public static AccountDAO getAccountDAO() {
		return accountDAO;
	}

}
