package com.mum.asd.OnlineBankingFramework.dao;

import com.mum.asd.OnlineBankingFramework.models.User;

public interface UserDAO extends BaseDAO<User> {

	User findUser(String userName, String password);
}
