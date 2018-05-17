package com.lfs.www.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfs.www.dao.TblHeroMapper;
import com.lfs.www.entity.TblHero;
import com.lfs.www.service.HeroService;

@Service("HeroService")
public class HeroServiceImp implements HeroService{
	
	@Autowired
	TblHeroMapper dao;


	@Override
	public int insert(TblHero record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}


	@Override
	public List<TblHero> selectHeros() {
		// TODO Auto-generated method stub
		return dao.selectHeros();
	}




	

}
