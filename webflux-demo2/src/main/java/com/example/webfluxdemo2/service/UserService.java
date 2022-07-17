package com.example.webfluxdemo2.service;

import com.example.webfluxdemo2.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/17 - 23:55
 * @Description 用户操作接口
 */
public interface UserService {
    //根据id查询用户
    Mono<User> getUserById(int id);

    //查询所有用户
    Flux<User> getAllUser();

    //添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
