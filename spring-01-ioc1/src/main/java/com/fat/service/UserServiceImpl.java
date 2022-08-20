package com.fat.service;

import com.fat.dao.UserDao;
import com.fat.dao.UserDaoImpl;
import com.fat.dao.UserDaoMysqlImpl;

/**
 * @author fatsea
 * @date 2022/8/7 - 23:04
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // 核心：setter接口动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        // 业务层调用dao层
        userDao.getUser();
    }
}
