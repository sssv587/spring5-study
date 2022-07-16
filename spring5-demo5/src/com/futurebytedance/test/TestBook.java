package com.futurebytedance.test;

import com.futurebytedance.entity.Book;
import com.futurebytedance.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 18:32
 * @Description
 */
public class TestBook {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加记录
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //添加记录修改记录
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("golang");
//        book.setUstatus("a");
//        bookService.updateBook(book);

        //删除记录
//        bookService.deleteBook("1");

        //查询返回某个值
//        System.out.println(bookService.findCount());

        //查询返回对象
//        System.out.println(bookService.findOne("1"));

        //查询返回集合
//        System.out.println(bookService.findAll());

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "java", "a"};
//        Object[] o2 = {"4", "c", "a"};
//        Object[] o3 = {"5", "rust", "a"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //调用批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"javascript", "a", "3"};
//        Object[] o2 = {"rust", "a", "4"};
//        Object[] o3 = {"c++", "a", "5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
