package cn.vincent.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import cn.vincent.dao.UserDao;
import cn.vincent.vo.User;

public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	
	@Override
	public List<User> findAll() {
		return sessionFactory.getCurrentSession()
				.createQuery("from User").list();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
