package com.atguigu.java;

public class Boss implements StaticProxy {
    @Override
    public void buy() {

        System.out.println("boss买东西");
    }

    @Override
    public void meeting() {

        System.out.println("boss要开会");
    }
}
