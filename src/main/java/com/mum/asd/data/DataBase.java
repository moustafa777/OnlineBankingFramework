package com.mum.asd.data;

import java.util.ArrayList;
import java.util.List;

import com.mum.asd.OnlineBankingFramework.models.User;

public final class DataBase {

	private static DataBase dataBase = new DataBase();

	private final List<User> users;

	private DataBase() {

		users = new ArrayList<>();
		initializeUsersData();
	}

	// Add users with their accounts and pills etc...
	private void initializeUsersData() {

	}

	public static DataBase getInstance() {
		return dataBase;
	}

}
