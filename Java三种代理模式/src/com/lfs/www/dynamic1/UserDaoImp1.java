package com.lfs.www.dynamic1;

public class UserDaoImp1 implements UserDao {

	@Override
	public void add(String name) {
		System.out.println("添加了名字为：" + name + "的用户");
	}

}
