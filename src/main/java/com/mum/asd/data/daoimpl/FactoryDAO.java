package com.mum.asd.data.daoimpl;

import com.mum.asd.OnlineBankingFramework.dao.AccountDAO;
import com.mum.asd.OnlineBankingFramework.dao.UserDAO;

/**
 * 
 * DAO implementation factory
 *
 */
public final class FactoryDAO {

	public static AccountDAO getAccountDAO() {
		return new AccountDAOImpl();
	}

	public static UserDAO getUserDAO() {
		return new UserDAOImpl();
	}

}
