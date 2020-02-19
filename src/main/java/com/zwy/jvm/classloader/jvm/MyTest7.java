package com.zwy.jvm.classloader.jvm;

/**
 * @author zwy
 * @time 2019/12/10
 * @since JDK 1.8
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> aClass = Class.forName("com.zwy.jvm.classloader.jvm.c");
        System.out.println(aClass.getClassLoader());
    }
}

class c {
}
