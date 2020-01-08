package com.zwy.jvm.classloader.mock;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(JMockit.class)
public class GreetingDataTest {

    @Test
    public void say(@Mocked GreetingData g1) {
        new Expectations() {
            {
               g1.say();
               result="hi,zwy";
            }
        };
        String result = g1.say();
        System.out.println(result);

        String hi = g1.sayHi();
        System.out.println(hi);

        GreetingData g2 = new GreetingData();
        String result2 = g2.say();
        System.out.println(result2);

        String hi2 = g1.sayHi();
        System.out.println(hi2);


        new Verifications(){
            {
                g1.say();
                times=2;
            }
        };
    }
}