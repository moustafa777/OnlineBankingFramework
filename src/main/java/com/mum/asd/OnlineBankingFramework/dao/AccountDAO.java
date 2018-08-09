package com.mum.asd.OnlineBankingFramework.dao;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface AccountDAO extends BaseDAO<Account> {

	 Account find(User user);
}
