package com.futurebytedance.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/13 - 0:47
 * @Description
 */
@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.futurebytedance"})
public class SpringConfig {

}
