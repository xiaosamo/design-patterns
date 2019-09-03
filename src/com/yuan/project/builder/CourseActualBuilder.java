package com.yuan.project.builder;

/**
 * @author yuan
 * @date 2019/3/31
 * @description
 */
public class CourseActualBuilder extends CourseBuilder{
    private Course course = new Course();

    @Override
    public void courseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void coursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);

    }

    @Override
    public void courseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);

    }

    @Override
    public void courseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);

    }

    @Override
    public void courseQA(String courseQA) {
        course.setCourseQA(courseQA);

    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
