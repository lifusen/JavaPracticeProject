package com.lfs.www.cglib1;

public class UserMain {
	public static void main(String[] args) {
		UserDao userdao = (UserDao)new ProxyHandler().getProxyInstance(new UserDao());
		userdao.add("南小驿");
	}
}
