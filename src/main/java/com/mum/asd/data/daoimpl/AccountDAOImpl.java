package com.mum.asd.data.daoimpl;

import java.util.List;

import com.mum.asd.OnlineBankingFramework.dao.AccountDAO;
import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.data.DataBase;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public Account find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Account find(User user) {
		return	DataBase.getInstance().getAcounts().stream().filter(acc -> acc.getUser().equals(user)).findFirst().orElse(null);
		
			
	}

}
