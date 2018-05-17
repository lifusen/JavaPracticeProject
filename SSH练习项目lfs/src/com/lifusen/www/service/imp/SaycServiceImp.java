package com.lifusen.www.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lifusen.www.dao.SaycDao;
import com.lifusen.www.entity.Sayc;
import com.lifusen.www.service.SaycService;

@Service("saycService")
public class SaycServiceImp implements SaycService{

	@Resource(name="saycDao")
	SaycDao ud;
	@Override
	public List<Sayc> login() {
		
		return ud.login();
	}

	@Override
	public Sayc regist(Sayc u) {
		
		return ud.regist(u);
	}

}
