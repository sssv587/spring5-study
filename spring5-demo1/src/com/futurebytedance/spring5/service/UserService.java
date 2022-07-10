package com.futurebytedance.spring5.service;

import com.futurebytedance.spring5.dao.UserDao;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/10 - 23:54
 * @Description
 */
public class UserService {
    //创建UserDAO类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.....");

        userDao.update();

        //创建UserDAO对象
//        UserDAO userDAO = new UserDAOImpl();
//        userDAO.update();
    }
}
