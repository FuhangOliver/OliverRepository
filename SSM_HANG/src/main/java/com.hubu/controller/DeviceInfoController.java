package com.hubu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hubu.model.DeviceiInfo;
import com.hubu.service.DeviceInfoService;
import com.hubu.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 查询请求
 */
@Controller
public class DeviceInfoController {
    @Autowired
    DeviceInfoService deviceInfoService;

    @RequestMapping("/deviceInfo")
    @ResponseBody
    public Message getwarningsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn, 10);
        List<DeviceiInfo> deviceInfo = deviceInfoService.getAll();
        PageInfo page = new PageInfo(deviceInfo, 10);
        return Message.success().add("pageInfo", page);

    }
}