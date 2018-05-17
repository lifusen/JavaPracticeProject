package com.lifusen.www.dao;

import java.util.List;

import com.lifusen.www.entity.Hero;

public interface HeroDao 
{
	List<Hero> login();
	Hero regist(Hero u);
	Hero update(Hero u);
	List<Hero> select(Integer id);
}
