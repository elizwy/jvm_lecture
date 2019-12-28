package com.zwy.jvm.classloader;

/**
 * @author zwy
 * @time 2019/12/25
 * @since JDK 1.8
 */
public class MyTest11 implements Runnable{
    private Thread thread;
     public MyTest11(){
         this.thread=new Thread(this);
         thread.start();
     }
    public static void main(String[] args) {

        new MyTest11();
    }

    @Override
    public void run() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        this.thread.setContextClassLoader(contextClassLoader);
        System.out.println(contextClassLoader.getClass());
        System.out.println(contextClassLoader.getParent().getClass());
    }
}
