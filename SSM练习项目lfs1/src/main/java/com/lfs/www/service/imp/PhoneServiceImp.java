package com.lfs.www.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfs.www.dao.TblPhoneMapper;
import com.lfs.www.entity.TblPhone;
import com.lfs.www.service.PhoneService;

@Service("PhoneService")
public class PhoneServiceImp implements PhoneService {

	@Autowired
	TblPhoneMapper tp;
	
	@Override
	public int insert(TblPhone record) {
		// TODO Auto-generated method stub
		return tp.insert(record);
	}

}
