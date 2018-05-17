package com.lifusen.www.dao;

import com.lifusen.www.entity.User;

public interface UserDao 
{
	User login(User u);
	User regist(User u);
	User sele(String loginName);
}
