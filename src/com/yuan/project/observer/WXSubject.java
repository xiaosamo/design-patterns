package com.yuan.project.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 * @date 2019/9/18
 * @description
 * 具体的发布者类-微信公众号
 */
public class WXSubject implements Subject{
    /**
     * 订阅者列表
     */
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }
    }
}
