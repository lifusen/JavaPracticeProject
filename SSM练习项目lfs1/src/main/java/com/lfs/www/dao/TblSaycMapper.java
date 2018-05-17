package com.lfs.www.dao;

import com.lfs.www.entity.TblSayc;
import com.lfs.www.entity.TblSaycExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSaycMapper {
    int countByExample(TblSaycExample example);

    int deleteByExample(TblSaycExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblSayc record);

    int insertSelective(TblSayc record);

    List<TblSayc> selectByExample(TblSaycExample example);
    
    List<TblSayc> selectSaycs();
    
    TblSayc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblSayc record, @Param("example") TblSaycExample example);

    int updateByExample(@Param("record") TblSayc record, @Param("example") TblSaycExample example);

    int updateByPrimaryKeySelective(TblSayc record);

    int updateByPrimaryKey(TblSayc record);
}