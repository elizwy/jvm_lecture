package com.zwy.jvm.classloader.mock;

import java.util.Locale;

public class Greet {
        public String sayHello(){
            Locale locale = Locale.getDefault();
            if(locale.equals(Locale.CHINA)){
               return "你好,jmockit!";
            }else {
                return "hello,jmockit!";
            }
        }
}
