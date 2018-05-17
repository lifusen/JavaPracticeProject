package com.lfs.www.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfs.www.dao.TblSaycMapper;
import com.lfs.www.entity.TblSayc;
import com.lfs.www.service.SaycService;

@Service("SaycService")
public class SaycServiceImp implements SaycService{
	
	@Autowired
	TblSaycMapper dao;
	@Override
	public List<TblSayc> selectSaycs() {
		return dao.selectSaycs();
	}

	@Override
	public int insert(TblSayc tblSayc) {
		// TODO Auto-generated method stub
		return dao.insert(tblSayc);
	}




	

}
