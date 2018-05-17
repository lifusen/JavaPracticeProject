package com.lifusen.www.dao;

import java.util.List;

import com.lifusen.www.entity.Sayc;

public interface SaycDao 
{
	List<Sayc> login();
	Sayc regist(Sayc u);
}
