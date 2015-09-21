package com.softserve.tc.diaryclient.main;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.softserve.tc.diaryclient.dao.impl.UserSessionDAOImpl;
import com.softserve.tc.diaryclient.entity.UserSession;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory("DiaryClientPersistence");
				EntityManager entitymanager = emfactory.
				createEntityManager( );
				entitymanager.getTransaction().begin( ); 
				
				entitymanager.getTransaction().commit();
				entitymanager.close();
				emfactory.close();
//		
//		UserSessionDAOImpl userSessionDAOimpl = new UserSessionDAOImpl();
//		UserSession userSession = new UserSession("6516551651", new Date(1745,5,15), null);
		
	}

}
