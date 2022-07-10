package com.futurebytedance.spring5;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/10 - 23:11
 * @Description 演示使用set方法进行注入属性
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    //创建属性对应的 set 方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bname + ":" + bauthor + ":" + address);
    }
}
