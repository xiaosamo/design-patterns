package com.yuan.project.sunny;

import java.lang.reflect.InvocationTargetException;

public class HairFactory {
    /**
     * 根据类型来创建对象
     */
    public HairInteface getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }

    /**
     * 上一种方式有很多if-else，下面使用反射，根据类名来生产对象
     */
    public HairInteface getHairByClass(String className) {
        //过时
        //HairInteface hair = (HairInteface) Class.forName(className).newInstance();
        try {
            HairInteface hair= (HairInteface) Class.forName(className).getDeclaredConstructor().newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
