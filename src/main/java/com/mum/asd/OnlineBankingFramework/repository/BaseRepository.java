package com.mum.asd.OnlineBankingFramework.repository;

import java.util.List;

public interface BaseRepository<T> {

	T find(long id);

	void add(T t);

	List<T> findAll();

	boolean remove(long id);

}
