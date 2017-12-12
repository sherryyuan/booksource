package com.example.liyuanma.recyclerviewapp;

/**
 * Created by liyuanma on 2017-12-11.
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
