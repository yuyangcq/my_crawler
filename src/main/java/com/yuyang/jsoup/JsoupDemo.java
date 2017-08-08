package com.yuyang.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

import static com.yuyang.constant.Constant.html;


/**
 * Created by yuyang on 2017/7/10.
 */
public class JsoupDemo {
    /**
     * 获取根节点以及子节点
     *
     * @param
     */
    public static void getNode(){

        String s="<?xml version=\"1.0\" encoding=\"gbk\" ?>" +
                "<yuyang>" +
                "<product type=\"identitycard\">" +
                "我的产品"+
                "</product>" +
                "<img>"+
                "<h1>440305198012255411</h1>" +
                "<h2>440305198012255411</h2>" +
                "</img>"+
                "</yuyang>";
        try {
//            org.dom4j.Document doc = DocumentHelper.parseText(html);

//            Element root=doc.getRootElement();//获取根节点
//            System.out.println(root.getName());//获取根节点的名称

            Document doc = Jsoup.parse(html, "utf-8");
            Elements divs = doc.select("div#titleList li a");
//            System.out.println(divs);
            Iterator it = divs.iterator();
            while(it.hasNext()) {
                Element element = (Element)it.next();

                System.out.println(element.html());
            }


            // 进行迭代；读取根节点下的所有节点
//            for (Iterator<Element> i = root.elementIterator(); i.hasNext(); ) {
//                Element element = i.next();
//                System.out.println("节点名称：" + element.getName());
//                System.out.println("节点值：" + element.getData());
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定标签
     */
    public static void getText() {

        Document doc = Jsoup.parse(html);
//        System.out.println("=======title========");// title值
//        System.out.println(doc.title());//String title = doc.title();
//        System.out.println("=======body========");// 具有body的标签
//        System.out.println(doc.body());//Element body = doc.body();
//        System.out.println("节点名:"+doc.body().nodeName());
//        System.out.println("标签名:"+doc.body().tagName());
//        System.out.println("父节点名:"+doc.body().parent() );

//        System.out.println("=======1========");
//        System.out.println("全部属性值:"+doc.body().attributes());
//        System.out.println("全部属性值:"+doc.body().attr("href"));
//        System.out.println("=======2========");
//        Elements container = doc.getElementsByClass("href");// 具有class=yu的标签
//        System.out.println(container);
//        System.out.println("=======3========");

        Elements links = doc.getElementsByAttributeValue("class","preart"); //选择器的形式, 获取具有 h1 属性的链接的集合links

        for(int i=0;i<links.size();i++){
            links.get(i).remove();
            System.out.println("5555");
        }

//        System.out.println("=====选择指定的元素==========");
//        //寻找键为key，值是yu的元素
//        Elements ListDiv = doc.getElementsByAttributeValue("class","list-timeline"");
//        System.out.println(ListDiv);

    }

    /**
     * 获取网页源码
     */
    public static void getHtml(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.oschina.net/")
                    .data("query", "Java")   //请求参数
                    .userAgent("I’m jsoup") //设置User-Agent
                    .cookie("auth", "token") //设置cookie
                    .timeout(3000)           //设置连接超时时间
                    .post();                 //使用POST方法访问URL
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc);
    }
}
