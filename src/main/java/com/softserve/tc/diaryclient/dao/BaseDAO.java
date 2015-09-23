package com.softserve.tc.diaryclient.dao;

import java.util.List;

public interface BaseDAO<T> {

	void create(T object);

	T findByNickName(String nickName);

	void update(T object);

	void delete(String nickName);

	List<T> getAll();
}
