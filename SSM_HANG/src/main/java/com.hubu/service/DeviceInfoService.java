package com.hubu.service;

import com.hubu.model.DeviceiInfo;
import com.hubu.dao.DeviceiInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceInfoService {

    @Autowired
    DeviceiInfoMapper deviceInfoMapper;

    public List<DeviceiInfo> getAll() {
        // TODO Auto-generated method stub
        return deviceInfoMapper.selectByExample(null);
    }
}
