package com.yuyang.mybatis;

/**
 * 新建与数据库表对应的实体类
 * Created by yuyan on 2017/7/24.
 */
public class User {
    //实体类的属性和表的字段名称一一对应
    private String id;
    private String name;
    private int age;
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public User() {
    }


}
