package com.zwy.jvm.classloader.daoImpl;

import com.zwy.jvm.classloader.dao.AccountDao;

/**
 * @author zwy
 * @time 2019/12/03
 * @since JDK 1.8
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public String getAccountList() {
        return "i have get some accounts";
    }
}
