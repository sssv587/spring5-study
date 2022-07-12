package com.futurebytedance.service;

import com.futurebytedance.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired //根据类型进行注入
//    @Qualifier(value = "userDaoImpl1") //根据名称进行注入,比如一个接口有多个实现类,需要指定名称
//    private UserDao userDao;

    //    @Resource //根据类型进行注入
    @Resource(name = "userDaoImpl1") //根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("Service add..." + name);
        userDao.add();
    }
}
