package com.atguigu.java;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void test(){

        BossXiaoMi bossXiaoMi = new BossXiaoMi(new Boss());
        bossXiaoMi.buy();
        bossXiaoMi.meeting();
    }

}
