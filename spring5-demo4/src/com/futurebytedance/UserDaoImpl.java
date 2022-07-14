package com.futurebytedance;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/14 - 23:20
 * @Description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add 方法执行了....");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update 方法执行了....");
        return id;
    }
}
