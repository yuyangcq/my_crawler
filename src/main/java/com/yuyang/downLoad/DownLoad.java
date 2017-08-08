package com.yuyang.downLoad;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by yuyang on 2017/7/6.
 */
public class DownLoad {
    /**
     * 以指定编码格式获取网页源码
     *
     * @param url
     * @param encoding
     * @return
     */
    public static String getPageSourceByUrl(String url, String encoding) {
        //状态码
        int responseCode;
        StringBuffer sb = new StringBuffer();
        URL urlObj = null;
        HttpURLConnection uc = null;
        BufferedReader br = null;
        try {
            //构建一URL对象
            urlObj = new URL(url);
            //通过URL生成静态页面
            uc = (HttpURLConnection) urlObj.openConnection();
            //获取服务器响应代码
            responseCode = uc.getResponseCode();
            //如果状态码等于200，得到输入流，即获得了网页的内容
            if (responseCode==200) {
                //使用getInputStream得到一输入流并由此构造一个BufferedReader对象
                br = new BufferedReader(new InputStreamReader(uc.getInputStream(), encoding));
                String tempLine = null;//临时变量
                while ((tempLine = br.readLine()) != null) {
                    sb.append(tempLine).append("\n");//每读一行后自动换行
                }
            }
            else{
                System.out.println("获取不到网页的源码，服务器响应代码为："+responseCode);
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("获取不到网页的源码,出现异常："+e);
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}