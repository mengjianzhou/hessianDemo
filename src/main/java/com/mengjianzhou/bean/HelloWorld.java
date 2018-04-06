package com.mengjianzhou.bean;

import java.io.Serializable;

/**
 * @auth mengjianzhou
 * @Date 2018/4/6
 */
public class HelloWorld implements Serializable {

    private String name;
    public HelloWorld() {

    }
    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
