package com.hubu.dao;

import com.hubu.model.DeviceiInfo;
import com.hubu.model.DeviceiInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceiInfoMapper {
    long countByExample(DeviceiInfoExample example);

    int deleteByExample(DeviceiInfoExample example);

    int deleteByPrimaryKey(Integer deviceid);

    int insert(DeviceiInfo record);

    int insertSelective(DeviceiInfo record);

    List<DeviceiInfo> selectByExample(DeviceiInfoExample example);

    DeviceiInfo selectByPrimaryKey(Integer deviceid);

    int updateByExampleSelective(@Param("record") DeviceiInfo record, @Param("example") DeviceiInfoExample example);

    int updateByExample(@Param("record") DeviceiInfo record, @Param("example") DeviceiInfoExample example);

    int updateByPrimaryKeySelective(DeviceiInfo record);

    int updateByPrimaryKey(DeviceiInfo record);
}