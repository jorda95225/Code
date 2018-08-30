package com.atguigu.java2;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test(){

        XiaoMi xiaoMi = new XiaoMi();

        BossProxy bp = (BossProxy) xiaoMi.getXiaoMi(new BigBoss());
        bp.buy();
        bp.meeting();

        BossProxy bp2 = (BossProxy) xiaoMi.getXiaoMi(new ITBoss());
        bp2.meeting();
        bp2.buy();
    }
}
