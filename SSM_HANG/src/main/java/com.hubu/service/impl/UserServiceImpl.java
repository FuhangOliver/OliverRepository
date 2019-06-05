package com.hubu.service.impl;

import com.hubu.dao.UserDao;
import com.hubu.model.Address;
import com.hubu.model.User;
import com.hubu.model.UserLogin;
import com.hubu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int userId) throws Exception {
        // TODO Auto-generated method stub

        //try{
        Address address = new Address();
        address.setName("插入地址，事务验证");
        userDao.insertAddress(address);

        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setUserName("sqx");
        user.setPassword("ddd");
        userDao.insertUser(user);
/*        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }*/
        return this.userDao.selectByPrimaryKey(userId);

    }
}
