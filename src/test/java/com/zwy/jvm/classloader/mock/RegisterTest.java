package com.zwy.jvm.classloader.mock;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JMockit.class)
public class RegisterTest {
    @Mocked
    Mail mail;

    @Test
    public void sigIn() {
        new Expectations(){
            {
              mail.sendMail();
              result=true;
            }
        };
        Register register=new Register();
        register.sigIn("zwy");
        new Verifications(){{
            mail.sendMail();
            times=1;
        }
        };
    }
}