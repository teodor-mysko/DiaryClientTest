package com.softserve.tc.diaryclient.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		
	}

}
