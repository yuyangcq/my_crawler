package com.yuyang.utils;

import org.junit.Test;

import static com.yuyang.constant.Constant.html;

/**
 * Created by yuyang on 2017/7/25.
 */
public class HelperTest {
    @Test
    public void testGetSubHtml(){
        String subHtml =new Helper().getSubHtml(html,"前翻",4,3);
        System.out.print(subHtml);
    }
}
