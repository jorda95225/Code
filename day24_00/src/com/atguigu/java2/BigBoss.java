package com.atguigu.java2;

import com.atguigu.java.Boss;

public class BigBoss implements BossProxy {
    @Override
    public void buy() {
        System.out.println("大老板要买东西");
    }

    @Override
    public void meeting() {

        System.out.println("大老板要开会");
    }
}
