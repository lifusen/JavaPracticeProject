package com.lfs.www.dynamic1;

public class HeroDaoImpl implements HeroDao{

	@Override
	public void delete(String name) {
		System.out.println("删除了名字为:"+ name +"的英雄");
		
	}

}
