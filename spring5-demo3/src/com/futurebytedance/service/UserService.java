package com.futurebytedance.service;

import org.springframework.stereotype.Component;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/12 - 23:54
 * @Description
 */
//在注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
//@Component(value = "userService") //<bean id="" class=".."/>
@Component
public class UserService {
    public void add() {
        System.out.println("Service add...");
    }
}
