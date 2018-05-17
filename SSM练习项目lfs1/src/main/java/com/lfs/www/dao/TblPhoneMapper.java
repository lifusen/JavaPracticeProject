package com.lfs.www.dao;

import com.lfs.www.entity.TblPhone;
import com.lfs.www.entity.TblPhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPhoneMapper {
    int countByExample(TblPhoneExample example);

    int deleteByExample(TblPhoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblPhone record);

    int insertSelective(TblPhone record);

    List<TblPhone> selectByExample(TblPhoneExample example);

    TblPhone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblPhone record, @Param("example") TblPhoneExample example);

    int updateByExample(@Param("record") TblPhone record, @Param("example") TblPhoneExample example);

    int updateByPrimaryKeySelective(TblPhone record);

    int updateByPrimaryKey(TblPhone record);
}