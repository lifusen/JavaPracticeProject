package com.lifusen.www.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lifusen.www.dao.SaycDao;
import com.lifusen.www.entity.Sayc;

@Repository("saycDao")
public class SaycDaoImp extends BaseDao implements SaycDao 
{

	@SuppressWarnings("unchecked")
	@Override
	public List<Sayc> login() 
	{	
		List<Sayc> list = getCurrentSession().createQuery(" from Sayc").list();
		
		return list;
	}

	@Override
	public Sayc regist(Sayc u) 
	{
		if(u!=null){
			getCurrentSession().save(u);
		}
		
		return u;
	}

}
