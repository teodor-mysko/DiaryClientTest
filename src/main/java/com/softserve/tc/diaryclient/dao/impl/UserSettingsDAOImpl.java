package com.softserve.tc.diaryclient.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diaryclient.dao.UserSettingsDAO;
import com.softserve.tc.diaryclient.entity.UserSettings;

@Repository("userSettingsDAO")
public class UserSettingsDAOImpl extends BaseDAOImpl<UserSettings> implements UserSettingsDAO{
	public UserSettingsDAOImpl() {
		super(UserSettings.class);
	}
}
