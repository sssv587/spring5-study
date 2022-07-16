package com.futurebytedance.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 21:34
 * @Description
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money + ? where username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    //少钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
