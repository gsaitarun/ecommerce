package com.smvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.FetchPojo;

@Repository
public class FetchDaoImplementations implements FetchDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<FetchPojo> listCategory() {
		System.out.println("implementsclass");
		Session session = sessionFactory.getCurrentSession();
		List<FetchPojo> list = session.createQuery("from FetchPojo").list();

		for (FetchPojo fetchPojo : list) {
			System.out.println(fetchPojo);
		}

		return list;
	}
	/*
	 * public List<FetchPojo> listCategory(FetchPojo p) { // TODO Auto-generated
	 * method stub return null; }
	 */
}
