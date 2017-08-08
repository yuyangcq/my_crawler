package com.yuyang.ioStream;

/**
 * Created by yuyang on 2017/7/11.
 */
public class WriteToFileTest {
    public static void main(String args[]){
        String path="S:\\write-test.txt";
        String s = ReadFile.readFileByLine("S:\\read-test.txt","utf-8").toString();
        String encoding = "utf-8";
        WriteToFile.write(path,s,encoding);
    }
}
