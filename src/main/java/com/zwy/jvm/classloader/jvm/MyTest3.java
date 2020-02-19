package com.zwy.jvm.classloader.jvm;

import java.util.UUID;

/**
 * @author zwy
 * @time 2019/12/01
 * @since JDK 1.8
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(Parent3.str);
    }
}
class Parent3{
    public static final String str= UUID.randomUUID().toString();
    static {
        System.out.println("parent3 static block");
    }
}
