package com.mybatis;

import com.yuyang.mybatis.User;
import com.yuyang.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by yuyang on 2017/7/24.
 */
public class UserTest {
    SqlSession sqlSession;

    @Test
    /**
     * 插入数据到数据库
     */
    public void insertUser() {
        sqlSession = MybatisUtil.getSqlSession();
        String id = "56422";
        String name = "张三";
        int age = 18;
        String sex = "女";
        User user = new User();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        user.setSex(sex);
        try {
            sqlSession.insert("insertUser", user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    /**
     * 查询数据库
     */
    public void queryById() {
        sqlSession = MybatisUtil.getSqlSession();
        int id = 56421;
        try {
            //执行查询返回一个唯一user对象的sql
            User user = sqlSession.selectOne("queryById", id);
            sqlSession.commit();
            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    /**
     * 更新数据库
     */
    public void updateUser(){
        sqlSession = MybatisUtil.getSqlSession();
        String id = "56422";
        String name = "李四";
        int age = 100;
        String sex = "男";
        User user = new User();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        user.setSex(sex);
        try {
            //执行查询返回一个唯一user对象的sql
            sqlSession.update("updateUser",user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
    @Test
    /**
     * 查询所有用户
     */
    public void getAllUsers(){
        sqlSession = MybatisUtil.getSqlSession();
        try {
            //执行查询操作，将查询结果自动封装成List<User>返回
            List<User> lstUsers = sqlSession.selectList("getAllUsers");
            System.out.println(lstUsers);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
    @Test
    /**
     * 删除用户
     */
    public void deleteUser(){
        sqlSession = MybatisUtil.getSqlSession();
        try {
            //执行删除操作
            int retResult = sqlSession.delete("deleteUser",56422);
            sqlSession.commit();
            System.out.println(retResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
}
