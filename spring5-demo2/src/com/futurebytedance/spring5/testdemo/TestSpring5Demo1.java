package com.futurebytedance.spring5.testdemo;

import com.futurebytedance.spring5.bean.Orders;
import com.futurebytedance.spring5.collectiontype.Book;
import com.futurebytedance.spring5.collectiontype.Course;
import com.futurebytedance.spring5.collectiontype.Stu;
import com.futurebytedance.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 23:09
 * @Description
 */
public class TestSpring5Demo1 {
    //测试集合注入
    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    //测试集合注入,将集合抽取出来,作为公用部分
    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

    //工厂bean,在配置文件定义 bean 类型可以和返回类型不一样，需要实现FactoryBean接口
    @Test
    public void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    //测试bean生命周期
    @Test
    public void testBean3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }
}
