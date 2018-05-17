package com.lfs.www.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfs.www.dao.TblUserMapper;
import com.lfs.www.entity.TblUser;
import com.lfs.www.entity.TblUserExample;
import com.lfs.www.service.UserService;

@Service("UserService")
public class UserServiceImp implements UserService{

	@Autowired
	private  TblUserMapper tblUserMapper;
	@Override
	public TblUser getUserByid(int id) {
		return this.tblUserMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<TblUser> selectByExample(TblUserExample tblUserExample) {
		// TODO Auto-generated method stub
		return this.tblUserMapper.selectByExample(tblUserExample);
	}
	@Override
	public int insert(TblUser record) {
		// TODO Auto-generated method stub
		return this.tblUserMapper.insert(record);
	}

}
