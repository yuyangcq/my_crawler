package com.yuyang.ioStream;

import java.io.*;

/**
 * Created by yuyang on 2017/6/22.
 */
public class ReadFile {
    /**
     * 功能：一次读取一行
     * @param filePath
     * @param encoding
     */
    public static StringBuffer readFileByLine(String filePath, String encoding) {
        StringBuffer buffer = new StringBuffer();
        InputStreamReader read = null;
        try {
            //将字符串路径封装成File对象
            File file = new File(filePath);
            //判断文件是否存在
            if (file.isFile() && file.exists()) {
                //创建文件字节读取流对象时，必须明确与之关联的数据源
                FileInputStream fis = new FileInputStream(file);
                //将字节流向字符流的转换。要启用从字节到字符的有效转换，可以提前从底层流读取更多的字节。
                read = new InputStreamReader(fis, encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineText;
                while ((lineText = bufferedReader.readLine()) != null) {
                    buffer.append('\n' + lineText);
                }
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return buffer;
    }
}
