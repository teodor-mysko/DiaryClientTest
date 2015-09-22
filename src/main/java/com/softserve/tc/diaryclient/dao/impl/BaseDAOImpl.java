package com.softserve.tc.diaryclient.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import com.softserve.tc.diary.dao.BaseDAO;
import com.softserve.tc.diaryclient.entity.LoginDuration;
import com.softserve.tc.diaryclient.entity.Settings;
import com.softserve.tc.diaryclient.entity.UserSession;
import com.softserve.tc.diaryclient.entity.UserStatistic;

public class BaseDAOImpl<T> implements BaseDAO<T> {

	private Class<T> entity;


	public BaseDAOImpl(Class<T> entity) {
		this.entity = entity;
	}

	public void create(T object) {
		EntityManager entityManager=null;

		try {
			System.out.println(object.toString());
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
			}
		}

	}

	public T findByNickName(String nickName) {
		EntityManager entityManager=null;

		T element=null;
		Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			element=(T) entityManager.createQuery("from "+persistentClass.getSimpleName()+ " where nick_name= '"+nickName + "'").getSingleResult();
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
			}
		}

		return element;
	}

	public void update(T object) {
		EntityManager entityManager=null;

		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			
			 if (object instanceof Settings){
				Settings settings=(Settings)object;
				entityManager.createQuery("UPDATE Settings SET language= '"+settings.getLanguage()
				+"', number_of_records_to_show='"+settings.getNumberOfRecordsToShow()
				+"', show_date_of_birth='"+settings.getShowDateOfBirth()+"', show_full_name='"+settings.getShowFullName()
				+"', theme='"+settings.getTheme()+"', time_format='"+settings.getTimeFormat()
				+"' where nick_name= '"+settings.getNickName()+"'").executeUpdate();
			entityManager.getTransaction().commit();
			}else if (object instanceof LoginDuration){
				LoginDuration logDur=(LoginDuration)object;
				entityManager.createQuery("UPDATE LoginDuration SET duration= '"+logDur.getDuration()
				+"', login_date='"+logDur.getLoginDate()
				+"' where nick_name= '"+logDur.getNickName()+"'").executeUpdate();
				entityManager.getTransaction().commit();
			}else if (object instanceof UserStatistic){
				UserStatistic userStat=(UserStatistic)object;
				entityManager.createQuery("UPDATE UserStatistic SET last_login= '"+userStat.getLastLogin()
				+"', last_records='"+userStat.getLastRecords()
				+"', number_of_logins='"+userStat.getNumberOfLogins()
				+"', number_of_records='"+userStat.getNumberOfRecords()
				+"' where nick_name= '"+userStat.getNickName()+"'").executeUpdate();
			entityManager.getTransaction().commit();
			}
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
			}
		}

	}

	public void delete(String nickName) {
		EntityManager entityManager=null;

		try {
			Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];

			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.createQuery("delete from "+persistentClass.getSimpleName()+ " where nick_name= '"+nickName + "'").executeUpdate();
			entityManager.getTransaction().commit();
		}
		finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
			}
		}

	}

	public List<T> getAll() {
		EntityManager entityManager=null;

		List<T> list=null;
		Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			list=entityManager.createQuery("from "+persistentClass.getCanonicalName()).getResultList();
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
			}
		}
		return list;
	}

}
