package com.atguigu.exr;

public class SingletonTest {
}
class Bank{

    private Bank(){}
    private static Bank bank = null;
    private static Bank getInstanceof(){
        if (bank == null) {
            synchronized (Bank.class) {
                if (bank == null) {
                    bank = new Bank();
                }
            }
        }
        return bank;
    }
}
