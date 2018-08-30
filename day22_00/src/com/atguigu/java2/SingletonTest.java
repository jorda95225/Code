package com.atguigu.java2;

public class SingletonTest {
}

//饿汉式
class Bank2{
    private Bank2(){}
    private static final Bank2 bank = new Bank2();
    public static Bank2 getInstance(){
        return bank;
    }
}
//懒汉式
class Bank{
    private Bank(){}
    private static Bank bank = null;
    public static Bank getInstance(){
        if (bank == null){
            synchronized (Bank.class){
                if (bank == null){
                    bank = new Bank();
                }
            }
        }
        return bank;
    }
}