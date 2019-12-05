package com.zwy.jvm.classloader;

/**
 * @author zwy
 * @time 2019/12/01
 * @since JDK 1.8
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Parent2.m);
    }
}
class Parent2{
    static {
        System.out.println("parent2 static block");
    }
//    public static final String str="hello world";
    public static final short s=123;
    public static final int i=1;
    public static final int m=128;
}
