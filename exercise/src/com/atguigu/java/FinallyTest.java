package com.atguigu.java;

public class FinallyTest {
    static final Integer x = new Integer(10);


    public static void main(String[] args) {

        FinallyTest f = new FinallyTest();
        f.setX(x);
        System.out.println(x.hashCode());
        System.out.println(x);
    }

    void setX(Integer x){
        System.out.println(x == FinallyTest.x);
        System.out.println(x++);
        System.out.println(x == FinallyTest.x);
    }

}
