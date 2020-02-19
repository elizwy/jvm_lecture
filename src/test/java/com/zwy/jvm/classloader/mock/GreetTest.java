package com.zwy.jvm.classloader.mock;

import mockit.Expectations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GreetTest {

    @Test
    public void testHello(){
        new Expectations(Locale.class){
            {
                Locale.getDefault();
                result=Locale.CHINA;
            }
        };
//        System.out.println(new Greet().sayHello());
        Assert.assertTrue("你好,jmockit!".equals((new Greet()).sayHello()));
//        Assert.assertEquals("你好,JMockit!",(new Greet().sayHello()));
    }
}
