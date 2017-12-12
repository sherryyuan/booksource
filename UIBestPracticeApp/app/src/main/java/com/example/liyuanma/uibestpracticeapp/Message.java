package com.example.liyuanma.uibestpracticeapp;

/**
 * Created by liyuanma on 2017-12-12.
 */

public class Message {

    public static final int TYPE_REVIECED = 0;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;

    public Message(String content, int type) {
        this.content = content;
        this.type = type;
    }


    public String getContent() {
        return content;
    }


    public int getType() {
        return type;
    }
}
