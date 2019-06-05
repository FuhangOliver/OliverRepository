package com.hubu.service.impl;

import com.hubu.model.UserLogin;
import com.hubu.service.UserLoginService;
import com.hubu.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserLoginServiceImp implements UserLoginService {
    @Autowired
    UserMapper userMapper;

    public UserLogin findUser(String name, String password) throws Exception {
        boolean flag = checkString(name, 3, 10) && checkString(password, 4, 10);
        if (!flag)
            return null;
        UserLogin UserLogin = new UserLogin();
        UserLogin.setName(name);
        UserLogin.setPassword(password);
        System.out.println("账号密码：" + name + ":" + password);
        return userMapper.findUser(UserLogin);
    }

    private boolean checkString(String str, int minL, int maxL) {
        return str != null && str.length() >= minL && str.length() <= maxL;
    }
}
