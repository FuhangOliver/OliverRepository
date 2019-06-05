package com.hubu.dao;

import com.hubu.model.Address;
import com.hubu.model.User;

public interface UserDao {

    User selectByPrimaryKey(int userId);

    void insertUser(User user);

    void insertAddress(Address address);

}
