package com.zwy.jvm.classloader.jvm;

/**
 * @author zwy
 * @time 2019/12/01
 * @since JDK 1.8
 */

/**
 * 当静态字段来说,只有直接定义了改字段的类才能被初始化
 * 当一个子类在初始化事要求其父类全部已经初始化了
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(Child.str2);
    }
}

class Myparent{
    public static String str="hello world";
    static {
        System.out.println("Myparent staitc block");
    }
}

class Child extends Myparent{
    public static String str2="hello child";
    static {
        System.out.println("Child staitc block");
    }
}
