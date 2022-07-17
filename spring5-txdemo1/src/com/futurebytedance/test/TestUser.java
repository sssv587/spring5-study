package com.futurebytedance.test;

import com.futurebytedance.config.TxConfig;
import com.futurebytedance.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 21:40
 * @Description
 */
public class TestUser {
    @Nullable
    private String userName;

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }


    //XML方式声明事务
    @Test
    public void testAccountXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //注解方式声明事务
    @Test
    public void testAccountAnno() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象，交给Spring管理
    @Test
    public void testGenericApplicationContext() {
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.调用context的方法进行对象注册
        context.refresh();
        context.registerBean("user1", User.class, User::new);
        //3.获取在Spring注册的对象
//        User user = (User) context.getBean("com.futurebytedance.test.User");
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
