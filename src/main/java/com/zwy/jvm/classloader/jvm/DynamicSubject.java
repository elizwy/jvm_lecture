package com.zwy.jvm.classloader.jvm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
    private Object object;

    public DynamicSubject(Object obj) {
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling:" + method);
        method.invoke(object,args);
        System.out.println("after calling:" + method);
        return null;
    }
}
