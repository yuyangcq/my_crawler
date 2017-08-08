package com.beans;

/**
 * 新建与数据库表对应的实体类
 * Created by yuyang on 2017/8/2.
 */
public class Ap {
    private String ApName;
    private int RSSI;

    public String getApName() {
        return ApName;
    }

    public void setApName(String apName) {
        ApName = apName;
    }

    public int getRSSI() {
        return RSSI;
    }

    public void setRSSI(int RSSI) {
        this.RSSI = RSSI;
    }
}
