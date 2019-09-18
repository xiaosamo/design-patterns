package com.yuan.project.observer;

/**
 * @author yuan
 * @date 2019/9/18
 * @description
 */
public class WXUser implements Observer {

    private String name;

    public WXUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "，您收到一条公众号信息：" + message);
    }
}
