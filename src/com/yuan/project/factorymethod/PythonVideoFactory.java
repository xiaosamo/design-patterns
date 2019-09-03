package com.yuan.project.factorymethod;

/**
 * @author yuan
 * @date 2019/4/6
 * @description
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
