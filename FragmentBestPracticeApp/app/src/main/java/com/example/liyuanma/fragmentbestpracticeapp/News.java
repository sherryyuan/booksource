package com.example.liyuanma.fragmentbestpracticeapp;

/**
 * Created by liyuanma on 2017-12-12.
 */

public class News {

    private String title;
    private String content;

    public News() {

    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
