package com.yuan.project.simplefactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yuan
 * @date 2019/4/1
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();

    }
}
