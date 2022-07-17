package com.futurebytedance.test;

import com.futurebytedance.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/17 - 21:30
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架
@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

    //执行时需要把TxConfig的注解去掉
    @Test
    public void test1() {
        userService.accountMoney();
    }
}
