package com.lfs.www.dynamic1;

public class UserMain {

	public static void main(String[] args) {
		ProxyHandler proxyHandler=new ProxyHandler();  
        UserDao userdao1 = (UserDao)proxyHandler.newProxyInstance(new UserDaoImp1()); 
		userdao1.add("南小驿");
		HeroDao herodao1 = (HeroDao)proxyHandler.newProxyInstance(new HeroDaoImpl());
		herodao1.delete("南小驿");
	}

}
