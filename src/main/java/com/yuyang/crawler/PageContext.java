package com.yuyang.crawler;

import org.htmlparser.Node;

/**
 * Created by yuyang on 2017/7/3.
 */
//页面内容
public class PageContext {
    private StringBuffer textBuffer;
    private int number;
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public StringBuffer getTextBuffer() {
        return textBuffer;
    }

    public void setTextBuffer(StringBuffer textBuffer) {
        this.textBuffer = textBuffer;
    }
}

