package com.softserve.tc.diaryclient.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import com.softserve.tc.diaryclient.dao.BaseDAO;

public class BaseDAOImpl<T> implements BaseDAO<T> {

	private Class<T> entity;


	public BaseDAOImpl(Class<T> entity) {
		this.entity = entity;
	}

	public void create(T object) {
		EntityManager entityManager=null;

		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
				//JPAUtil.close();

			}
		}

	}

	public T findByNickName(String nickName) {
		EntityManager entityManager=null;

		T element=null;
		Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println("from "+persistentClass.getSimpleName()+ " where nick_name= '"+nickName+"'");
		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			element=(T) entityManager.createQuery("from "+persistentClass.getSimpleName()+ " where nick_name= '"+nickName + "'").getSingleResult();
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
				//JPAUtil.close();

			}
		}

		return element;
	}

	public void update(T object) {
		EntityManager entityManager=null;

		try {
			entityManager = JPAUtil.getFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.merge(object);
			entityManager.getTransaction().commit();
		} finally {
			if ((entityManager != null) && (entityManager.isOpen())) {
				entityManager.close();
				//JPAUtil.close();
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
				//JPAUtil.close();
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
				//JPAUtil.close();
			}
		}
		return list;
	}

}
