package com.mybatis;

import com.yuyang.mybatis.Signal;
import com.yuyang.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by yuyan on 2017/8/2.
 */
public class RssiTest {
    SqlSession sqlSession;

    @Test
    /**
     * 插入数据到数据库
     */
    public void insertRSSI() {
        sqlSession = MybatisUtil.getSqlSession();
        long CrawlingTime = System.currentTimeMillis();
        String RP = "fosun";
        int RSSI = -18;
        String sex = "女";
        Signal signal = new Signal();
        signal.setCrawlingTime(CrawlingTime);
        signal.setRSSI(RSSI);
        signal.setRP(RP);
        try {
            sqlSession.insert("insertRSSI", signal);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
}
