package com.yuan.project.factorymethod;

/**
 * @author yuan
 * @date 2019/4/6
 * @description 在子类进行实现
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
