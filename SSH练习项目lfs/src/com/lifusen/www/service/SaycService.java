package com.lifusen.www.service;

import java.util.List;

import com.lifusen.www.entity.Sayc;

public interface SaycService {
	List<Sayc> login();
	Sayc regist(Sayc u);
}
