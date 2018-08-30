package com.atguigu.java2;

public class ThreadAPI {

    public static void main(String[] args) {

        MyThread3 thread3 = new MyThread3();
        thread3.start();
        thread3.setName("aaa");

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}