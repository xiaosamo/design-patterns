package com.yuan.project.builder;

/**
 * @author yuan
 * @date 2019/3/31
 * @description
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle, String courseQA) {
        courseBuilder.courseName(courseName);
        courseBuilder.coursePPT(coursePPT);
        courseBuilder.courseVideo(courseVideo);
        courseBuilder.courseArticle(courseArticle);
        courseBuilder.courseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
