package com.softserve.tc.diaryclient.main;

import java.util.Date;
import java.time.ZonedDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.softserve.tc.diaryclient.dao.impl.JPAUtil;
import com.softserve.tc.diaryclient.dao.impl.LoginDurationDAOImpl;
import com.softserve.tc.diaryclient.dao.impl.SettingsDAOImpl;
import com.softserve.tc.diaryclient.dao.impl.UserSessionDAOImpl;
import com.softserve.tc.diaryclient.dao.impl.UserStatisticDAOImpl;
import com.softserve.tc.diaryclient.entity.Language;
import com.softserve.tc.diaryclient.entity.LoginDuration;
import com.softserve.tc.diaryclient.entity.Settings;
import com.softserve.tc.diaryclient.entity.Theme;
import com.softserve.tc.diaryclient.entity.TimeFormat;
import com.softserve.tc.diaryclient.entity.UserSession;
import com.softserve.tc.diaryclient.entity.UserStatistic;
import com.softserve.tc.diaryclient.entity.YesNo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EntityManagerFactory emfactory = Persistence.
		// createEntityManagerFactory("DiaryClientPersistence");
		// EntityManager entitymanager = emfactory.
		// createEntityManager( );
		// entitymanager.getTransaction().begin( );
		//
		// entitymanager.getTransaction().commit();
		// entitymanager.close();
		// emfactory.close();
		//
		UserSessionDAOImpl userSessionDAOimpl = new UserSessionDAOImpl();
		UserStatisticDAOImpl userStatDAO = new UserStatisticDAOImpl();
		LoginDurationDAOImpl logDurDAO = new LoginDurationDAOImpl();
		SettingsDAOImpl settingsDAO = new SettingsDAOImpl();

		// CREATE
		UserSession userSession = new UserSession("Oleg", "1234532", Date.from(ZonedDateTime.now().toInstant()));
		userSessionDAOimpl.create(userSession);
		userSessionDAOimpl.create(new UserSession("Ira", "fdfggvfd", Date.from(ZonedDateTime.now().toInstant())));
		userSessionDAOimpl.create(new UserSession("Oleg", "15684531", Date.from(ZonedDateTime.now().toInstant())));
		
		userStatDAO.create(new UserStatistic("Bob", 23, 12, "Titlt, World, War", Date.from(ZonedDateTime.now().toInstant())));
		userStatDAO.create(new UserStatistic("Marly",3, 1, "God, Love, Sea", Date.from(ZonedDateTime.now().toInstant())));
		userStatDAO.create(new UserStatistic("Repley", 10, 5, "jhg, hggy , hg, kju", Date.from(ZonedDateTime.now().toInstant())));
		
		logDurDAO.create(new LoginDuration("Bob", Date.from(ZonedDateTime.now().toInstant()), 0.233));
		logDurDAO.create(new LoginDuration("Marly", Date.from(ZonedDateTime.now().toInstant()), 0.025));
		logDurDAO.create(new LoginDuration("Repley", Date.from(ZonedDateTime.now().toInstant()), 0.489));
		
		settingsDAO.create(new Settings("Bob", Theme.DEFAULT, 3, YesNo.NO, YesNo.YES, Language.ENG, TimeFormat.AM));
		settingsDAO.create(new Settings("Marly", Theme.MINIONS, 3, YesNo.YES, YesNo.YES, Language.UKR, TimeFormat.PM));
		settingsDAO.create(new Settings("Repley", Theme.SPRING, 4, YesNo.YES, YesNo.NO, Language.UKR, TimeFormat.AM));

		
		
		// FIND
		 System.out.println(userSessionDAOimpl.findByNickName("Ira"));
		 System.out.println(userStatDAO.findByNickName("Marly"));
		 System.out.println(logDurDAO.findByNickName("Repley"));
		 System.out.println(settingsDAO.findByNickName("Bob"));

		 

		// UPDATE

		userSessionDAOimpl.update(new UserSession("Ira", "111111111111111111111", Date.from(ZonedDateTime.now().toInstant())),"333333333333333",Date.from(ZonedDateTime.now().toInstant()));
		userStatDAO.update(new UserStatistic("Bob", 11, 11, "qqqqqqqqqqq", Date.from(ZonedDateTime.now().toInstant())));
		logDurDAO.update(new LoginDuration("Repley", Date.from(ZonedDateTime.now().toInstant()), 0.1111111111));
		settingsDAO.update(new Settings("Marly", Theme.SPRING, 5, YesNo.NO, YesNo.YES, Language.ENG, TimeFormat.AM));

		// DELETE
		userStatDAO.delete("Bob");
		userSessionDAOimpl.delete("Oleg");
		logDurDAO.delete("Marly");
		settingsDAO.delete("Repley");
		
		
		// GETALL
		 System.out.println(userSessionDAOimpl.getAll());
		 System.out.println(userStatDAO.getAll());
		 System.out.println(settingsDAO.getAll());
		 System.out.println(logDurDAO.getAll());
		 
		 JPAUtil.close();


	}

}
