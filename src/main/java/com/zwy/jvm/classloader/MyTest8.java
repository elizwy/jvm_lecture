package com.zwy.jvm.classloader;

/**
 * @author zwy
 * @time 2019/12/10
 * @since JDK 1.8
 */
public class MyTest8 {
    public static void main(String[] args) {
        ClassLoader cla = ClassLoader.getSystemClassLoader();
        System.out.println(cla);
        while (cla!=null){
            System.out.println(cla.getParent());
            cla=cla.getParent();
        }
    }
}
