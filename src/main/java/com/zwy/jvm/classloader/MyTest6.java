package com.zwy.jvm.classloader;

/**
 * @author zwy
 * @time 2019/12/03
 * @since JDK 1.8
 */
public class MyTest6 {
    public static void main(String[] args) {
        Parent6 instance = Parent6.getInstance();
        System.out.println(instance.getCounter1());
        System.out.println(instance.getCounter2());

    }
}

class Parent6{
    public static int counter1;
    private Parent6(){
        counter1++;
        counter2++;
    }
    public static int counter2=0;
    private static Parent6 instance=new Parent6();
    public static Parent6 getInstance(){
        return instance;
    }

    public  int getCounter1() {
        return counter1;
    }

    public  int getCounter2() {
        return counter2;
    }
}
