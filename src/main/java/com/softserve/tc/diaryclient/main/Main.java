package com.softserve.tc.diaryclient.main;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.softserve.tc.diaryclient.dao.impl.UserSessionDAOImpl;
import com.softserve.tc.diaryclient.entity.UserSession;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				EntityManagerFactory emfactory = Persistence.
//						createEntityManagerFactory("DiaryClientPersistence");
//						EntityManager entitymanager = emfactory.
//						createEntityManager( );
//						entitymanager.getTransaction().begin( ); 
//						
//						entitymanager.getTransaction().commit();
//						entitymanager.close();
//						emfactory.close();
//				
	UserSessionDAOImpl userSessionDAOimpl = new UserSessionDAOImpl();

		//CREATE
//		UserSession userSession = new UserSession("Vova", "njtyrfjhyr",  Date.from(ZonedDateTime.now().toInstant()));
//		System.out.println(userSession.getUuid());
//		userSessionDAOimpl.create(userSession);
//		System.out.println(userSession.getUuid());
	UserSession userSession = new UserSession("Thomas", "gngnet11111111",  Date.from(ZonedDateTime.now().toInstant()));
		userSessionDAOimpl.create(userSession);
		//FIND
//		UserSession us=userSessionDAOimpl.findByNickName("Ira");
	//	System.out.println(us);
		
		//UPDATE
		//userSession.setSessionNumber("frt67if~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//userSessionDAOimpl.update(userSession);
		
		//DELETE
//		userSessionDAOimpl.delete("Ira");
		//GETALL
		//System.out.println(userSessionDAOimpl.getAll());




	}

}
