package com.lifusen.www.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lifusen.www.dao.UserDao;
import com.lifusen.www.entity.Telphone;
import com.lifusen.www.entity.User;

@Repository("userDao")
public class UserDaoImp extends BaseDao implements UserDao 
{

	@SuppressWarnings("unchecked")
	@Override
	public User login(User u) 
	{	
		List<User> list = getCurrentSession().createQuery(" from User u where u.loginName = :loginName"
		+ " and u.loginPwd = :loginPwd")
		.setParameter("loginName", u.getLoginName())
		.setParameter("loginPwd", u.getLoginPwd()).list();
		if(list.size()==0){
			return null;
		}else{
			return (User)list.get(0);
		}
	}

	@Override
	public User regist(User u) 
	{
		User us = new User();
		us.setAddress(u.getAddress());
		us.setAge(u.getAge());
		us.setEmail(u.getEmail());
		us.setLoginName(u.getLoginName());
		us.setLoginPwd(u.getLoginPwd());
		us.setName(u.getName());
		us.setPositionid(u.getPositionid());
		us.setTel_list(u.getTel_list());
		try{
			Integer uid = (Integer)getCurrentSession().save(us);
			us.setId(uid);
			for(int i=0;i<u.getTel_list().size();i++)
			{
				Telphone tel = new Telphone();
				tel.setUser(us);
				tel.setNumber(u.getTel_list().get(i).getNumber());
				getCurrentSession().save(tel);
				}
		}catch(Exception e)
		{
			e.printStackTrace();
			us=null;
		}
		return us;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User sele(String loginName)
	{
		List<User> list = getCurrentSession().createQuery(" from User u where u.loginName = :loginName")
		.setParameter("loginName",loginName).list();
		if(list.size()==0)
		{
			return null;
		}else
		{
			return (User)list.get(0);
		}
	}

}
