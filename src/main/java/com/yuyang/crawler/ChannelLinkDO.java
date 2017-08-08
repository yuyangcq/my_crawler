package com.yuyang.crawler;

/**
 * Created by yuyang on 2017/7/3.
 */
public class ChannelLinkDO {
    public String getEncode() {
        return Encode;
    }

    public void setEncode(String encode) {
        Encode = encode;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getLinktext() {
        return Linktext;
    }

    public void setLinktext(String linktext) {
        Linktext = linktext;
    }

    private String Encode;
    private String Link;
    private String Linktext;

}
