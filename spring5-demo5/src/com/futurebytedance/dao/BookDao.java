package com.futurebytedance.dao;

import com.futurebytedance.entity.Book;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/16 - 13:06
 * @Description
 */
public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
