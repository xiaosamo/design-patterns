package com.yuan.project.sunny;

public class SunnyTest {

    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
//        HairInteface left = hairFactory.getHair("left");

        //根据类名创建对象，注意要写包名
        HairInteface left = hairFactory.getHairByClass("com.yuan.project.sunny.LeftHair");
        if (left != null) {
            left.draw();
        }
    }
}
