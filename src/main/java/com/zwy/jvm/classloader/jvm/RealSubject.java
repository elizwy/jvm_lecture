package com.zwy.jvm.classloader.jvm;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real object request");
    }
}
