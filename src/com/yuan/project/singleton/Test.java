package com.yuan.project.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yuan
 * @date 2019/3/29
 * @description
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        HungrySingleton singleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(singleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(singleton);
        System.out.println(newInstance);
        System.out.println(singleton == newInstance);


//        Class clazz = HungrySingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton singleton = HungrySingleton.getHungrySingleton();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        System.out.println(singleton);
//        System.out.println(newInstance);
//        System.out.println(singleton == newInstance);

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();


    }
}
