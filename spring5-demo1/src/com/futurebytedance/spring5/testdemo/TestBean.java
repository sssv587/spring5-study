package com.futurebytedance.spring5.testdemo;

import com.futurebytedance.spring5.Orders;
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

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
