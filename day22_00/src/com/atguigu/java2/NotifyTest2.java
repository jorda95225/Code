package com.atguigu.java2;

public class NotifyTest2 {
    public static void main(String[] args) {

        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
              MyThread.class.notify();
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "== " + ticket--);
                    try {
                        MyThread.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    return;
                }
            }
        }
    }
}
