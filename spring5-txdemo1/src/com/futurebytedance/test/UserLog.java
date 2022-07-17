package com.futurebytedance.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/17 - 18:17
 * @Description 演示日志框架
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
