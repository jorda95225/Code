package com.atguigu.java2;

public class ITBoss implements BossProxy{
    @Override
    public void buy() {
        System.out.println("it老板要买东西");
    }

    @Override
    public void meeting() {
        System.out.println("it老板要开会");
    }
}
