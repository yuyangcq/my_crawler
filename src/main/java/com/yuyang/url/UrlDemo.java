package com.yuyang.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yuyang on 2017/7/20.
 */
public class UrlDemo {
    public static void get(){
        try {
            URL url = new URL("http://www.blog.csdn.net/zhujianlin1990");
            System.out.println(url.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String agrs[]){
        UrlDemo.get();
    }
}
