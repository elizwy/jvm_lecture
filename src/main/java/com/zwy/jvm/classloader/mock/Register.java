package com.zwy.jvm.classloader.mock;

public class Register {
    public void sigIn(String name){
        Mail m=new Mail();
        System.out.println("processing register");
        if(m.sendMail()){
            System.out.println(name+"注册成功");
        }else {
            System.out.println(name+"注册失败");
        }
    }
}
