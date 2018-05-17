package com.lifusen.www.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lifusen.www.dao.HeroDao;
import com.lifusen.www.entity.Hero;
import com.lifusen.www.service.HeroService;

@Service("heroService")
public class HeroServiceImp implements HeroService{

	@Resource(name="heroDao")
	HeroDao ud;
	@Override
	public List<Hero> login() {
		
		return ud.login();
	}

	@Override
	public Hero regist(Hero u) {
		
		return ud.regist(u);
	}

	@Override
	public List<Hero> select(Integer id) {
		// TODO Auto-generated method stub
		return ud.select(id);
	}

	@Override
	public void update(Hero hero) {
		ud.update(hero);
		
	}

}
