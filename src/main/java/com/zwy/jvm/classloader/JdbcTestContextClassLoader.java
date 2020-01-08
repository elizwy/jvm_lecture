package com.zwy.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class JdbcTestContextClassLoader {
    public static void main(String[] args) {
        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);

        Iterator<Driver> iterator = load.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("Driver:"+driver.getClass()+", loader:"+driver.getClass().getClassLoader());
        }
        System.out.println("当前线程的上下文类加载器:"+Thread.currentThread().getContextClassLoader());
        System.out.println("serviceLoader的类加载器:"+load.getClass().getClassLoader());
    }
}
