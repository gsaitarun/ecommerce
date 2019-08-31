package com.smvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.LoginPojo;
import com.smvc.pojo.RegistrationPojo;

@Repository
@Transactional
public class UserDaoImplements implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	// HibernateTemplate template;

	public void registrate(RegistrationPojo user) {
		Session session;

		session = sessionFactory.getCurrentSession();

		session.save(user);
	}

	public void setFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public RegistrationPojo validation(LoginPojo login) {

		return null;
	}

	@Override
	public LoginPojo Connect1() {
		// TODO Auto-generated method stub
		return null;
	}

}
