package com.futurebytedance.spring5.bean;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 0:24
 * @Description 员工类
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
