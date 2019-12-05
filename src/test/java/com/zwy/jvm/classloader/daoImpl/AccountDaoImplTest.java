package com.zwy.jvm.classloader.daoImpl;

import com.zwy.jvm.classloader.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author zwy
 * @time 2019/12/03
 * @since JDK 1.8
 */
public class AccountDaoImplTest {

    @Test
    public void getAccountList() {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao bean = con.getBean(AccountDao.class);
        System.out.println(bean.getAccountList());
    }
}