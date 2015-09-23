package com.softserve.tc.diaryclient.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diaryclient.dao.LoginDurationDAO;
import com.softserve.tc.diaryclient.entity.LoginDuration;

@Repository("loginDurationDAO")
public class LoginDurationDAOImpl extends BaseDAOImpl<LoginDuration> implements LoginDurationDAO{
	public LoginDurationDAOImpl() {
		super(LoginDuration.class);
	}

}
