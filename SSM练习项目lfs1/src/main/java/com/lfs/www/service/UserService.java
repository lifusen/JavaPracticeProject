package com.lfs.www.service;

import java.util.List;

import com.lfs.www.entity.TblUser;
import com.lfs.www.entity.TblUserExample;

public interface UserService {
	public TblUser getUserByid(int id);
	public List<TblUser> selectByExample(TblUserExample tblUserExample);
	public int insert(TblUser tblUser);
}
