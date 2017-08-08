package com.yuyang.ioStream;

/**
 * Created by yuyang on 2017/6/22.
 */
public class ReadFileTest {
    public static void main(String agrs[]) {
        StringBuffer buffer = new StringBuffer();
        String filePath = "S:\\test.txt";
        String encoding = "gbk";
        buffer = ReadFile.readFileByLine(filePath, encoding);
        System.out.println(buffer.toString());
        WriteToFile.write("S:\\test-1.txt",buffer.toString(),"utf-8");

    }

}
