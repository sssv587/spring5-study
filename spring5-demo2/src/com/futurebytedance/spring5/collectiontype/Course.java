package com.futurebytedance.spring5.collectiontype;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 23:14
 * @Description
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
