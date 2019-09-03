package com.yuan.project.factorymethod;

/**
 * @author yuan
 * @date 2019/4/1
 * @description
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
