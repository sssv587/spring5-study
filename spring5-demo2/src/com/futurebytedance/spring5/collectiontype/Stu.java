package com.futurebytedance.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/11 - 22:59
 * @Description 学生类-xml注入集合属性
 */
public class Stu {
    //1.数组类型属性
    private String[] courses;

    //2.list集合类型
    private List<String> list;

    //3.map集合类型属性
    private Map<String, String> maps;

    //4.set集合类型属性
    private Set<String> sets;

    //学生所学多门课程
    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
