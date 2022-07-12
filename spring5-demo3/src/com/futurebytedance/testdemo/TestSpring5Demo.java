package com.futurebytedance.testdemo;

import com.futurebytedance.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/12 - 23:47
 * @Description
 */
public class TestSpring5Demo {
    @Test
    public void testService() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
