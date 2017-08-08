package com.yuyang.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by yuyang on 2017/7/25.
 */
public class Helper {
    /**
     * 获取关键字所在行的前面几行和后面几行的网页源码
     * @param html
     * @param keyWord
     * @param front
     * @param behind
     * @return
     */
    public String getSubHtml(String html, String keyWord, int front, int behind) {
        StringBuffer buffer = new StringBuffer();
        if (html == "" || keyWord == "" || front < 0 || behind < 0) return "";
        int line = 0;
        int begin = 0;
        int end = 0;
        List<String> subLines = new ArrayList<String>();
        List<String> lines = Arrays.asList(html.split("\n+?"));
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains(keyWord)) {
                line = i;
                begin = i - front;
                end = i + behind;
            }
        }
        if (begin < 0 || begin > lines.size()) return "";
        for (int i = begin; i <= end; i++) {
            buffer.append(lines.get(i)).append("\n");
        }
        return buffer.toString();
    }

}
