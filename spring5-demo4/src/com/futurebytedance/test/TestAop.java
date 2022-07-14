package com.futurebytedance.test;

import com.futurebytedance.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/15 - 0:29
 * @Description
 */
public class TestAop {
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
