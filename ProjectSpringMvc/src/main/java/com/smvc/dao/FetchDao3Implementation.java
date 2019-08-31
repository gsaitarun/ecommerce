package com.smvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.FetchPojo3;

@Repository
public class FetchDao3Implementation implements FetchDao3
{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<FetchPojo3> listCategory3()   
	{
		System.out.println("implementsclass23");
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM FetchPojo3 where id < 4";
		 Query query = session.createQuery(hql);
		System.out.println(""+query);
		List results = (query).list();
		 return results ;
	}

}
