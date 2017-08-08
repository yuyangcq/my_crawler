package com.yuyang.downLoad;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuyan on 2017/7/10.
 */
public class DownLoadTest {
    private static int k = 1;
    private static int i = 1;
    private static List<String> list = new ArrayList<String>();

    public static void main(String args[]) {
        String url = "https://avio.pw/cn/actresses/page/" + i;
        List<String> list = getAll(url);
        DownLoadTest.download(list);
    }

    //    public static int getAll(String url) {
//        int count;
//        StringBuffer buffer = new StringBuffer();
//        String s = DownLoad.getPageSourceByUrl(url, "utf-8");
//        Document doc = Jsoup.parse(s, "utf-8");
//        Elements divs = doc.select("div#waterfall div[class^=item]");
//
//        for (Element element : divs) {
//            Elements txt = element.getElementsByTag("span");
//            WriteToFile.write("S://shuju.txt", txt.text(), "utf-8");
//        }
//        count = k++;
//        System.out.println("==========" + count + "=========");
//
//        if (divs.size() >= 50) {
//            int j = ++i;
//            System.out.println("https://avio.pw/cn/actresses/page/" + j);
//            DownLoadTest.getAll("https://avio.pw/cn/actresses/page/" + j);
//
//        }
//        return divs.size();
//    }
    public static List<String> getAll(String url) {
        String s = DownLoad.getPageSourceByUrl(url, "utf-8");
        Document doc = Jsoup.parse(s, "utf-8");
        Elements pics = doc.select("div#waterfall div[class^=photo-frame] img");
        for (Element element : pics) {
            String href = element.attr("src");
            list.add(href);
        }

        return list;
    }

    private static void download(List<String> listImgSrc) {

//        String url ="http://upload.news.cecb2b.com/2016/0327/1459067610166.jpg";
        String url = "https://jp.netcdn.space/mono/actjpgs/sasaki_aki.jpg";
            byte[] btImg = getImageFromNetByUrl(url);
            if (null != btImg && btImg.length > 0) {
                System.out.println("读取到：" + btImg.length + " 字节");
                String fileName = "百度.gif";
                writeImageToDisk(btImg, fileName);
            } else {
                System.out.println("没有从该连接获得内容");
            }

    }

    /**
     * 将图片写入到磁盘
     * @param img 图片数据流
     * @param fileName 文件保存时的名称
     */
    public static void writeImageToDisk(byte[] img, String fileName){
        try {
            File file = new File("D:\\" + fileName);
            FileOutputStream fops = new FileOutputStream(file);
            fops.write(img);
            fops.flush();
            fops.close();
            System.out.println("图片已经写入到D盘");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据地址获得数据的字节流
     *
     * @param strUrl 网络连接地址
     * @return
     */
    public static byte[] getImageFromNetByUrl(String strUrl) {
        try {
            URL url = new URL(strUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(5000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据
            return btImg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从输入流中获取数据
     *
     * @param inStream 输入流
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }
}
