package com.example.liyuanma.uicustomvewapp.layout;

/**
 * Created by liyuanma on 2017-12-11.
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name, int id){
        this.name = name;
        this.imageId = id;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
