package com.softserve.tc.diaryclient.userinterface;

import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.tc.diaryclient.dao.LoginDurationDAO;
import com.softserve.tc.diaryclient.dao.UserSessionDAO;
import com.softserve.tc.diaryclient.dao.UserSettingsDAO;
import com.softserve.tc.diaryclient.dao.UserStatisticDAO;
import com.softserve.tc.diaryclient.entity.Language;
import com.softserve.tc.diaryclient.entity.LoginDuration;
import com.softserve.tc.diaryclient.entity.Theme;
import com.softserve.tc.diaryclient.entity.TimeFormat;
import com.softserve.tc.diaryclient.entity.UserSession;
import com.softserve.tc.diaryclient.entity.UserSettings;
import com.softserve.tc.diaryclient.entity.UserStatistic;
import com.softserve.tc.diaryclient.entity.YesNo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 EntityManagerFactory emfactory = Persistence.
//		 createEntityManagerFactory("DiaryClientPersistence");
//		 EntityManager entitymanager = emfactory.
//		 createEntityManager( );
//		 entitymanager.getTransaction().begin( );
//		
//		 entitymanager.getTransaction().commit();
//		 entitymanager.close();
//		 emfactory.close();
		//
		
		
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
//				"/META-INF/appContext.xml");
//		UserSessionDAO userSessionDAO = (UserSessionDAO)context.getBean("userSessionDAO");
//		UserStatisticDAO userStatDAO = (UserStatisticDAO)context.getBean("userStatisticDAO");
//		LoginDurationDAO logDurDAO = (LoginDurationDAO)context.getBean("loginDurationDAO");
//		UserSettingsDAO settingsDAO = (UserSettingsDAO)context.getBean("userSettingsDAO");
//
//		// CREATE
//		UserSession userSession = new UserSession("Oleg", "1234532", Date.from(ZonedDateTime.now().toInstant()));
//		userSessionDAO.create(userSession);
//		userSessionDAO.create(new UserSession("Ira", "fdfggvfd", Date.from(ZonedDateTime.now().toInstant())));
//		userSessionDAO.create(new UserSession("Oleg", "15684531", Date.from(ZonedDateTime.now().toInstant())));
//		
//		userStatDAO.create(new UserStatistic("Bob", 23, 12, "Titlt, World, War", Date.from(ZonedDateTime.now().toInstant())));
//		userStatDAO.create(new UserStatistic("Marly",3, 1, "God, Love, Sea", Date.from(ZonedDateTime.now().toInstant())));
//		userStatDAO.create(new UserStatistic("Repley", 10, 5, "jhg, hggy , hg, kju", Date.from(ZonedDateTime.now().toInstant())));
//		
//		logDurDAO.create(new LoginDuration("Bob", Date.from(ZonedDateTime.now().toInstant()), 0.233));
//		logDurDAO.create(new LoginDuration("Marly", Date.from(ZonedDateTime.now().toInstant()), 0.025));
//		logDurDAO.create(new LoginDuration("Repley", Date.from(ZonedDateTime.now().toInstant()), 0.489));
//		
//		settingsDAO.create(new UserSettings("Bob", Theme.DEFAULT, 3, YesNo.NO, YesNo.YES, Language.ENG, TimeFormat.AMPM));
//		settingsDAO.create(new UserSettings("Marly", Theme.MINIONS, 3, YesNo.YES, YesNo.YES, Language.UKR, TimeFormat.FORMAT24));
//		settingsDAO.create(new UserSettings("Repley", Theme.SPRING, 4, YesNo.YES, YesNo.NO, Language.UKR, TimeFormat.AMPM));

		
		
		// FIND
//		 System.out.println(userSessionDAO.findByNickName("Ira"));
//		 System.out.println(userStatDAO.findByNickName("Marly"));
//		 System.out.println(logDurDAO.findByNickName("Repley"));
//		 System.out.println(settingsDAO.findByNickName("Bob"));

		 

		// UPDATE

//		userSessionDAOimpl.update(new UserSession("Ira", "111111111111111111111", Date.from(ZonedDateTime.now().toInstant())));
//		userStatDAO.update(new UserStatistic("Bob", 11, 11, "qqqqqqqqqqq", Date.from(ZonedDateTime.now().toInstant())));
//		logDurDAO.update(new LoginDuration("Repley", Date.from(ZonedDateTime.now().toInstant()), 0.1111111111));
//		settingsDAO.update(new UserSettings("Marly", Theme.SPRING, 5, YesNo.NO, YesNo.YES, Language.ENG, TimeFormat.AMPM));

		// DELETE
//		userStatDAO.delete("Bob");
//		userSessionDAO.delete("Oleg");
//		logDurDAO.delete("Marly");
//		settingsDAO.delete("Repley");
		
		
		// GETALL
//		 System.out.println(userSessionDAO.getAll());
//		 System.out.println(userStatDAO.getAll());
//		 System.out.println(settingsDAO.getAll());
//		 System.out.println(logDurDAO.getAll());
//		 
//		 JPAUtil.close();

	}

}
