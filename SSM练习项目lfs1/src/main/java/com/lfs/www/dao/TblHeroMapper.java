package com.lfs.www.dao;

import com.lfs.www.entity.TblHero;
import com.lfs.www.entity.TblHeroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblHeroMapper {
    int countByExample(TblHeroExample example);

    int deleteByExample(TblHeroExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblHero record);

    int insertSelective(TblHero record);

    List<TblHero> selectByExample(TblHeroExample example);
    
    List<TblHero> selectHeros();
    
    TblHero selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblHero record, @Param("example") TblHeroExample example);

    int updateByExample(@Param("record") TblHero record, @Param("example") TblHeroExample example);

    int updateByPrimaryKeySelective(TblHero record);

    int updateByPrimaryKey(TblHero record);
}