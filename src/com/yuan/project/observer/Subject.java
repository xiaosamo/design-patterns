package com.yuan.project.observer;

/**
 * @author yuan
 * @date 2019/9/18
 * @description
 * 发布者
 */
public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 更新消息时通知订阅者
     * @param message
     */
    void notify(String message);
}
