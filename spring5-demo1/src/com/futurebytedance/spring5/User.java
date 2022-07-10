package com.futurebytedance.spring5;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/10 - 19:48
 * @Description
 */
public class User {
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void add() {
        System.out.println("add......");
    }
}
