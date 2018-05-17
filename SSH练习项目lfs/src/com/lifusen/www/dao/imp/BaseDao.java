package com.lifusen.www.dao.imp;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao 
{
	
	@Resource(name="sessionFactory")
	protected SessionFactory sessionFactory;

	protected Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
}
