package com.mum.asd.OnlineBankingFramework.dao;

import java.util.List;

public interface BaseDAO<T> {

	T find(long id);

	void add(T t);

	List<T> findAll();

	boolean remove(long id);

}
