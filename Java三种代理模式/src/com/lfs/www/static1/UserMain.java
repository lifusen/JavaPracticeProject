package com.lfs.www.static1;

public class UserMain {

	public static void main(String[] args) {
		UserDao userdao1 = new UserDaoProxy(new UserDaoImp1());
		userdao1.add("A");
	}

}
