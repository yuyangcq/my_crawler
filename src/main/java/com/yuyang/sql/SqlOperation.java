package com.yuyang.sql;

import java.sql.*;


/**
 * Created by yuyang on 2017/6/21.
 */
public class SqlOperation {
    //声明Connection对象
    private static Connection con = null;
    private PreparedStatement psql = null;
    private boolean flag = true;
    private Statement st;

    /**
     * 建立连接数据库
     *
     * @return
     */
    public static Connection dbConnection() {
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名stargazer_crawler
//        String url = "jdbc:mysql://114.55.61.225:3306/stargazer_crawler";
//        //MySQL配置时的用户名
//        String user = "dev";
//        //MySQL配置时的密码
//        String password = "dev";
        String url = "jdbc:mysql://127.0.0.1:3306/mysql";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "200811";

        try {
            //加载驱动程序
            Class.forName(driver);
            //getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
                System.out.println("成功连接到数据库!");
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("对不起,找不到驱动!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            System.out.println("对不起,数据库连接失败!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 关闭数据库连接
     */
    public void dbDisConnection() {
        if (con != null) {
            try {
                con.close();
                System.out.println("数据库连接关闭!!!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 插入数据到数据库
     *
     * @param insertString
     */
    public void insertInfo(String insertString){
        try {
            st = (Statement) dbConnection().createStatement();
            st.execute(insertString);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * @param buffer
     * @return
     */
    public boolean updateInfo(String updateString,StringBuffer buffer, int ChannelId) {

        try {
            //要执行的SQL语句
            String sql = updateString;
            //预处理更新（修改）数据
            psql = con.prepareStatement(sql);
            psql.setString(1, buffer.toString());   //设置参数1，将parse_scripts改为buffer
            int i = psql.executeUpdate();
            if (i == 0) {
                flag = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (psql != null) {
                try {
                    psql.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }


}

