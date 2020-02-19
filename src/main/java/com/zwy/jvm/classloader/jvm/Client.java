package com.zwy.jvm.classloader.jvm;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        RealSubject rs = new RealSubject();
        DynamicSubject ds = new DynamicSubject(rs);
        Class<?> cls = rs.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), ds);
        subject.request();
        System.out.println(subject.getClass());
        System.out.println(subject.getClass().getSuperclass());
    }
}
