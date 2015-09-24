package com.softserve.tc.diaryclient.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diaryclient.dao.UserSessionDAO;
import com.softserve.tc.diaryclient.entity.UserSession;
@Repository("userSessionDAO")
public class UserSessionDAOImpl extends BaseDAOImpl<UserSession> implements UserSessionDAO{
	public UserSessionDAOImpl() {
		super(UserSession.class);
	}
}
