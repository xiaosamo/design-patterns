package com.yuan.project.observer;

/**
 * @author yuan
 * @date 2019/9/18
 * @description
 */
public class Test {
    public static void main(String[] args) {
        WXSubject wxSubject = new WXSubject();

        // 添加两个关注者
        wxSubject.registerObserver(new WXUser("西丽"));
        wxSubject.registerObserver(new WXUser("李希"));

        wxSubject.notify("感谢关注公众号[程序人生!]");
    }
}
