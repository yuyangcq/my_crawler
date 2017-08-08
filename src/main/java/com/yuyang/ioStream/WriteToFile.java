package com.yuyang.ioStream;

import java.io.*;

/**
 * Created by yuyang on 2017/7/6.
 */
public class WriteToFile {
    /**
     *
     * @param path
     * @param buffer
     * @param encoding
     */
    public static void write(String path, String buffer, String encoding) {
        File file = new File(path);
        String content = buffer;
        BufferedWriter writer = null;
        if (!file.exists()) try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true), encoding));
            writer.write(content);
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
