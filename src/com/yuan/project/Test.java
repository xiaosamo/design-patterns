package com.yuan.project;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1和s2是同一个实例");
        } else {
            System.out.println("s1和s2不是同一个实例");
        }

        Singieton2 s3 = Singieton2.getInstance();
        Singieton2 s4 = Singieton2.getInstance();
        if (s3 == s4) {
            System.out.println("s3和s4是同一个实例");
        } else {
            System.out.println("s3和s4不是同一个实例");
        }
    }
}
