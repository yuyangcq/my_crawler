package com.yuyang.mybatis;

/**
 * 新建与数据库表对应的实体类
 * Created by yuyang on 2017/8/2.
 */
public class Signal {
    //实体类的属性和表的字段名称一一对应
    private long CrawlingTime;
    private String RP;
    private int RSSI;

    public Signal() {
    }

    public int getRSSI() {
        return RSSI;
    }

    public void setRSSI(int RSSI) {
        this.RSSI = RSSI;
    }

    public String getRP() {
        return RP;
    }

    public void setRP(String RP) {
        this.RP = RP;
    }

    public long getCrawlingTime() {
        return CrawlingTime;
    }

    public void setCrawlingTime(long crawlingTime) {
        CrawlingTime = crawlingTime;
    }


}
