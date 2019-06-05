package com.hubu.dao;

import com.hubu.model.UserLogin;

public interface UserMapper {
    UserLogin findUser(UserLogin UserLogin) throws Exception;
}
