package com.futurebytedance.spring5.factorybean;

import com.futurebytedance.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 23:35
 * @Description
 */
public class MyBean implements FactoryBean<Course> {
    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }


    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
