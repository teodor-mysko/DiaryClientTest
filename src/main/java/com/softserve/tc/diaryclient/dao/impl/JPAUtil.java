package com.softserve.tc.diaryclient.dao.impl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final String PERSISTENCE_UNIT_NAME = "DiaryClientPersistence";

	private static EntityManagerFactory factory = null;
	
	private JPAUtil() {
	}

	public static EntityManagerFactory getFactory() {

		if (factory == null){
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;

	}

	public static void close(){
		factory.close();
	}


}
