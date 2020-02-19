package com.zwy.jvm.classloader.jvm;

import java.net.URL;

/**
 * @author zwy
 * @time 2019/12/10
 * @since JDK 1.8
 */
public class MyTest9 {
    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String resources="Test9.class";
        URL resource = contextClassLoader.getResource(resources);
        System.out.println(resources);

    }
}
class Test9{}
