package com.futurebytedance.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 12:44
 * @Description
 */
@Configuration
@ComponentScan(basePackages = {"com.futurebytedance"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
