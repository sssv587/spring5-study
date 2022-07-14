package com.futurebytedance.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/15 - 0:43
 * @Description
 */
@Component
@Aspect
@Order(2)
public class PersonProxy {
    @Before(value = "execution(* com.futurebytedance.aopanno.User.add(..))")
    public void before() {
        System.out.println("PersonProxy before....");
    }
}
