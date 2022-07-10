package com.futurebytedance.spring5.testdemo;

import com.futurebytedance.spring5.Book;
import com.futurebytedance.spring5.Orders;
import com.futurebytedance.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/10 - 19:53
 * @Description Spring的入门案例
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        //1.加载Spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.orderTest();
    }
}
