package com.lifusen.www.service;

import com.lifusen.www.entity.User;

public interface UserService {
	User login(User u);
	User regist(User u);
	User sele(String loginName);
}
