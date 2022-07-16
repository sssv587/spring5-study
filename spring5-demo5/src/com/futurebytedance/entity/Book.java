package com.futurebytedance.entity;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 18:22
 * @Description
 */
public class Book {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
