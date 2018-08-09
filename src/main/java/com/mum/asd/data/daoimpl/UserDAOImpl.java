package com.mum.asd.data.daoimpl;

import java.util.List;

import com.mum.asd.OnlineBankingFramework.dao.UserDAO;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.data.DataBase;

public class UserDAOImpl implements UserDAO {

	@Override
	public User find(long id) {
		return DataBase.getInstance().getUsers().stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void add(User t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
