package com.futurebytedance.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/15 - 0:18
 * @Description 被增强的类
 */
@Component
public class User {
    public void add() {
        System.out.println("add....");
    }
}
