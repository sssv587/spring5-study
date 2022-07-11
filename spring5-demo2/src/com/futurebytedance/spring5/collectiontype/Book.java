package com.futurebytedance.spring5.collectiontype;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 23:21
 * @Description
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
