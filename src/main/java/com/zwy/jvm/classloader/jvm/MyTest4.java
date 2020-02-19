package com.zwy.jvm.classloader.jvm;

/**
 * @author zwy
 * @time 2019/12/02
 * @since JDK 1.8
 */
public class MyTest4 {
    public static void main(String[] args) {
        Parent4[] parent4s=new Parent4[4];
        System.out.println(parent4s.getClass());
        System.out.println(parent4s.getClass().getSuperclass());

        Parent4[][] parent4s1=new Parent4[1][3];
        System.out.println(parent4s.getClass());
        System.out.println(parent4s.getClass().getSuperclass());

        String[][] str=new String[1][3];
        System.out.println(str.getClass());
        System.out.println(str.getClass().getSuperclass());

        int[] in=new int[3];
        System.out.println(in.getClass());
        System.out.println(in.getClass().getSuperclass());

        short[] shorts=new short[3];
        System.out.println(shorts.getClass());
        System.out.println(shorts.getClass().getSuperclass());

        boolean[] booleans=new boolean[3];
        System.out.println(booleans.getClass());
        System.out.println(booleans.getClass().getSuperclass());

        long[] longs=new long[3];
        System.out.println(longs.getClass());
        System.out.println(longs.getClass().getSuperclass());

    }
}
class Parent4{
    static {
        System.out.println("parent4 static block");
    }
}

