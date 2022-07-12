package com.futurebytedance.spring5.autowire;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/12 - 23:11
 * @Description 自动装配
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
