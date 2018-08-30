package com.atguigu.java2;

public class ThreadTest {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
        thread.setName("aaa");

        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "= " + i);
            }
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1){
                System.out.println(Thread.currentThread().getName()+ "= " + i);
            }
        }
    }
}