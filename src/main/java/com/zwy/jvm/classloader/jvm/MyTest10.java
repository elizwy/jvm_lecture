package com.zwy.jvm.classloader.jvm;

import java.io.*;

/**
 * @author zwy
 * @time 2019/12/11
 * @since JDK 1.8
 */
public class MyTest10 extends ClassLoader{

    private String classLoaderName;
    private final String fileExtension=".class";
    private String path;

    public MyTest10(String classLoaderName){
        super();
        this.classLoaderName=classLoaderName;
    }

    public MyTest10(String classLoaderName,ClassLoader parent){
        super(parent);
        this.classLoaderName=classLoaderName;
    }

    public static void main(String[] args) throws Exception {
        MyTest10 loader1 = new MyTest10("loader1");
        loader1.setPath("/home/elizwy/Documents/");
        Class<?> aClass = loader1.loadClass("com.zwy.jvm.classloader.jvm.MyTest1");
        Object o = aClass.newInstance();
        System.out.println(o);
        System.out.println(ClassLoader.getSystemClassLoader());
    }

    public void setPath(String path){
        this.path=path;
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException{
        System.out.println("class load name :"+this.classLoaderName);
        byte[] bytes = loadClassData(name);
        return this.defineClass("MYTest1",bytes,0,bytes.length);
    }

    public byte[] loadClassData(String name){

        InputStream in=null;
        byte[] data=null;
        ByteArrayOutputStream baos=null;

        try {
            name =name.replace(".","/");
            in = new FileInputStream(new File(this.path+name + this.fileExtension));
            int ch=0;
            while(-1!=(ch=in.read())){
                baos.write(ch);
            }
            data=baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
