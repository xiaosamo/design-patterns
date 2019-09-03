package com.yuan.project.factorymethod;

/**
 * @author yuan
 * @date 2019/4/1
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 父类的引用指向子类的实现
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
