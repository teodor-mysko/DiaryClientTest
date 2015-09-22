package com.softserve.tc.diaryclient.dao.impl;

import java.util.Date;

import javax.persistence.EntityManager;

import com.softserve.tc.diaryclient.entity.UserSession;

public class UserSessionDAOImpl extends BaseDAOImpl<UserSession> {

	public UserSessionDAOImpl() {
		super(UserSession.class);
	}

	//@Override
	public void update(UserSession object, String newSessionNumber, Date endSession) {
		EntityManager entityManager = null;
		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			UserSession us = (UserSession) object;
			entityManager.createQuery("UPDATE UserSession SET session_number='" + newSessionNumber+"', end_session='"+ endSession
					+ "' where nick_name= '" + us.getNickName() + "' AND session_number='"+us.getSessionNumber()+"'").executeUpdate();
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
				// JPAUtil.close();
			}
		}
	}

}
