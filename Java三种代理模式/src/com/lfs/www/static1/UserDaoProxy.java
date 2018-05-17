package com.lfs.www.static1;

public class UserDaoProxy implements UserDao{

	private UserDao userdao;
	
	
	public UserDaoProxy(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void add(String name) {
		System.out.println("静态前置内容");
		userdao.add(name);		
		System.out.println("静态后置内容");
	}

}
