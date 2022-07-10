package com.futurebytedance.spring5.bean;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 0:24
 * @Description 部门类
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
