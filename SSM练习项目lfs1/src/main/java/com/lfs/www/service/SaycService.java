package com.lfs.www.service;

import java.util.List;

import com.lfs.www.entity.TblSayc;

public interface SaycService {
	public List<TblSayc> selectSaycs();
	public int insert(TblSayc tblSayc);
}
