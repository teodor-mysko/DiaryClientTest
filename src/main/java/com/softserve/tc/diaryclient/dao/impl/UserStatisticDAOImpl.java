package com.softserve.tc.diaryclient.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diaryclient.dao.UserStatisticDAO;
import com.softserve.tc.diaryclient.entity.UserStatistic;


@Repository("userStatisticDAO")
public class UserStatisticDAOImpl extends BaseDAOImpl<UserStatistic> implements UserStatisticDAO{

	public UserStatisticDAOImpl() {
		super(UserStatistic.class);
	}

}
