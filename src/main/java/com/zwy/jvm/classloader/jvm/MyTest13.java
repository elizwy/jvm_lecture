package com.zwy.jvm.classloader.jvm;

import java.io.IOException;
import java.sql.DriverManager;

public class MyTest13 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://lochost:3306/test","","");
    }
}
