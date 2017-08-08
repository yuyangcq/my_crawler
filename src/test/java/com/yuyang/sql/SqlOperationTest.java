package com.yuyang.sql;

import com.yuyang.ioStream.ReadFile;
import org.apache.log4j.Logger;

/**
 * Created by yuyan on 2017/7/10.
 */
public class SqlOperationTest {
    private  static  int ChannelId = 101;
    private static final Logger logger = Logger.getLogger(SqlOperationTest.class);

    public static void main(String agrs[]) {
        StringBuffer buffer = new StringBuffer();
        String filePath = "S:\\test.txt";
        String encoding = "gbk";
        buffer = ReadFile.readFileByLine(filePath, encoding);
//        String updateString = "update t_spider_task_copy set url = ? where channel_id = " + ChannelId;


      String insertString = "insert into student (s_id,s_name,s_age,s_sex) values('2151091','李春江',28,'男')";
        //建立数据库连接
        SqlOperation sql = new SqlOperation();
        logger.info("info...");
        System.out.println("正在执行操作...");
        sql.insertInfo(insertString);
        System.out.println("操作完成!!!");
        //释放数据库连接
        sql.dbDisConnection();
    }
}
