package com.hubu.service;

import com.hubu.model.UserLogin;

public interface UserLoginService {
    UserLogin findUser(String name, String password) throws Exception;
}
