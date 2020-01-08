package com.zwy.jvm.classloader;

public class Test2 {
    String str = "welcome";
    private int s = 5;
    public static Integer in = 10;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setS(8);
        in = 15;
    }

    public synchronized void setS(int s) {
        this.s = s;
    }

    private void test(String str) {
        synchronized (str) {
            this.s = s;

        }
    }

    private synchronized static void test2() {
    }
}
