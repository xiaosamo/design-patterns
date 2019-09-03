package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/6
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
