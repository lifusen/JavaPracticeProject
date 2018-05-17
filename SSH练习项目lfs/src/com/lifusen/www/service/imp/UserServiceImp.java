package com.lifusen.www.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lifusen.www.dao.UserDao;
import com.lifusen.www.entity.User;
import com.lifusen.www.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService{

	@Resource(name="userDao")
	UserDao ud;
	@Override
	public User login(User u) {
		
		return ud.login(u);
	}

	@Override
	public User regist(User u) {
		
		return ud.regist(u);
	}

	@Override
	public User sele(String loginName) {
		return ud.sele(loginName);	
	}

}
