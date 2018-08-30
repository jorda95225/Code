package com.atguigu.java;

public class BossXiaoMi implements StaticProxy {

    private Boss boss;
    public BossXiaoMi(Boss boss){

        this.boss = boss;
    }

    @Override
    public void buy() {

        boss.buy();

    }

    @Override
    public void meeting() {

        boss.meeting();
    }
}
