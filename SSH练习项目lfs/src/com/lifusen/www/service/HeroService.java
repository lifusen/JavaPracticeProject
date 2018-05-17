package com.lifusen.www.service;

import java.util.List;

import com.lifusen.www.entity.Hero;

public interface HeroService {
	List<Hero> login();
	Hero regist(Hero u);
	List<Hero> select(Integer id );
	void update(Hero hero);
}
