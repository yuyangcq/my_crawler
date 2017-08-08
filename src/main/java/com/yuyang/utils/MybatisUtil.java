package com.yuyang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by yuyang on 2017/7/24.
 */
public class MybatisUtil {
    private final static SqlSessionFactory sqlSessionFactory;

    static {
        //mybatis的配置文件
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
            //方式一：使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
            reader = Resources.getResourceAsReader(resource);
            //方式二：使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
            //InputStream is = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //方式一：构建sqlSession的工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //方式二：构建sqlSession的工厂
        //sessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * 获取SqlSessionFactory
     *
     * @return SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    /**
     * 获取SqlSession
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {
        //创建能执行映射文件中sql的sqlSession
        return sqlSessionFactory.openSession();
    }

    /**
     * 关闭SqlSession
     */
    public static void closeSession(SqlSession sqlSession) {
        if (sqlSession != null)
            sqlSession.close();
    }
}
