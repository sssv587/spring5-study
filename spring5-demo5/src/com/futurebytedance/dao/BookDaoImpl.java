package com.futurebytedance.dao;

import com.futurebytedance.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 13:06
 * @Description
 */
@Repository
public class BookDaoImpl implements BookDao {
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(Book book) {
        //1. 创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2. 调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //更新
    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //删除
    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id = ?";
        Object[] args = {1};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    //返回查询对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id = ?";
        //调用方法
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    //返回查询集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        //调用方法
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量更新
    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量删除
    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
