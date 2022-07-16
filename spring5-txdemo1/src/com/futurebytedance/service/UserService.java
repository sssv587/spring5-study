package com.futurebytedance.service;

import com.futurebytedance.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 21:33
 * @Description
 */
@Service
@Transactional
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
//        try {
//            //第一步 开启事务
//
//
//            //第二步 进行业务操作
        //lucy少100
        userDao.reduceMoney();

//        int i = 10 / 0;

        //mary多100
        userDao.addMoney();

        //第三步 没有发生异常，提交事务
//        } catch (Exception e) {
//            //第四步 出现异常，事务回滚
//            e.printStackTrace();
//        }

    }
}
