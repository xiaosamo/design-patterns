package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/6
 * @description
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
