package com.lifusen.www.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lifusen.www.dao.HeroDao;
import com.lifusen.www.entity.Hero;

@Repository("heroDao")
public class HeroDaoImp extends BaseDao implements HeroDao
{

	@SuppressWarnings("unchecked")
	@Override
	public List<Hero> login()
	{	
		List<Hero> list = getCurrentSession().createQuery(" from Hero").list();
		
		return list;
	}

	@Override
	public Hero regist(Hero u) 
	{
		if(u!=null){
			getCurrentSession().save(u);
		}
		
		return u;
	}

	@Override
	public Hero update(Hero u) {
		if(u!=null){
			getCurrentSession().update(u);
		}
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hero>  select(Integer id) {
		List<Hero> list = getCurrentSession().createQuery("from Hero where id =:id").setParameter("id", id).list();
		return list;
	}

}
