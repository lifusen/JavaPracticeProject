package com.lfs.www.service;

import java.util.List;

import com.lfs.www.entity.TblHero;

public interface HeroService {
	int insert(TblHero tblHero);
	List<TblHero> selectHeros();
}
