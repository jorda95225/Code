package com.atguigu.java;

public class SingletonTest {
    public static void main(String[] args) {
        Bank bank = Bank.getInsrance();
        Bank bank2 = Bank.getInsrance();
        System.out.println(bank);
        System.out.println(bank2);

        Bank2 bank3 = Bank2.getInstance();
        Bank2 bank4 = Bank2.getInstance();
        System.out.println(bank3);
        System.out.println(bank4);
    }

}

class Bank{
    private Bank(){}
    private final static Bank bank = new Bank();
    public static Bank getInsrance(){
        return bank;
    }
}

class Bank2{
    private Bank2(){}
    private static Bank2 bank2 = null;
    public static Bank2 getInstance(){
        if (bank2 == null){
            synchronized (Bank.class){
                if (bank2 == null) {
                    bank2 = new Bank2();
                }
            }
        }
        return bank2;
    }
}
