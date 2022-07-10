package com.futurebytedance.spring5.testdemo;

import com.futurebytedance.spring5.Orders;
import com.futurebytedance.spring5.bean.Emp;
import com.futurebytedance.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 0:05
 * @Description
 */
public class TestBean {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
