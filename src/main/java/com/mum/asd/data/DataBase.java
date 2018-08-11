package com.mum.asd.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;

public final class DataBase {

	private static DataBase dataBase = new DataBase();

	private final List<User> users;
	private final List<Account> acounts;

	private DataBase() {

		users = new ArrayList<>();
		acounts = new ArrayList<>();
		initializeUsersData();
	}

	/**
	 * Add users with their accounts and pills etc...
	 */
	private void initializeUsersData() {

		Random random = new Random();

		// Generate accounts
		for (int i = 0; i < 10; i++) {
			acounts.add(new Account(IdNumberGenerator.generateAccountNumber(), random.nextDouble() * 25000));
		}

		// Generate users with accounts
		for (int i = 1; i <= 10; i++) {
			users.add(new User(IdNumberGenerator.generateUserId(), "user_name" + i, "User" + i, "123",
					acounts.get(i - 1)));
		}
		
	}
	
	

	public List<Account> getAcounts() {
		return acounts;
	}

	public List<User> getUsers() {
		return users;
	}

	public static DataBase getInstance() {
		return dataBase;
	}

}
