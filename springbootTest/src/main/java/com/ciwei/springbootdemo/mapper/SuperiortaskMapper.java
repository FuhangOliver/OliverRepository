package com.ciwei.springbootdemo.mapper;

import com.ciwei.springbootdemo.pojo.Superiortask;
import com.ciwei.springbootdemo.pojo.SuperiortaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiortaskMapper {
    long countByExample(SuperiortaskExample example);

    int deleteByExample(SuperiortaskExample example);

    int deleteByPrimaryKey(Integer initiatingid);

    int insert(Superiortask record);

    int insertSelective(Superiortask record);

    List<Superiortask> selectByExample(SuperiortaskExample example);

    Superiortask selectByPrimaryKey(Integer initiatingid);

    int updateByExampleSelective(@Param("record") Superiortask record, @Param("example") SuperiortaskExample example);

    int updateByExample(@Param("record") Superiortask record, @Param("example") SuperiortaskExample example);

    int updateByPrimaryKeySelective(Superiortask record);

    int updateByPrimaryKey(Superiortask record);
}