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
	public void add(User user) {
		DataBase.getInstance().getUsers().add(user);
	}

	@Override
	public List<User> findAll() {
		return DataBase.getInstance().getUsers();
	}

	@Override
	public boolean remove(long id) {

		User user = DataBase.getInstance().getUsers().stream().filter(u -> u.getId() == id).findFirst().orElse(null);

		if (user != null) {
			DataBase.getInstance().getUsers().remove(user);
			return true;
		}

		return false;
	}

	@Override
	public User findUser(String userName, String password) {
		return DataBase.getInstance().getUsers().stream()
				.filter(user -> user.getUserName().equals(userName) && user.getPassword().equals(password)).findFirst()
				.orElse(null);
	}

}
