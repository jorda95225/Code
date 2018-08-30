package com.atguigu.exr;

public class ThreadTest {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("我爱java");
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + "== " + i);
        }

    }
}