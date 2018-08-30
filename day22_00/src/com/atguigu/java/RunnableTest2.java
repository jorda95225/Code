package com.atguigu.java;

public class RunnableTest2 {
    public static void main(String[] args) {

        MyRunnable2 myRunnable = new MyRunnable2();
        Thread t1 = new Thread(myRunnable);
        t1.setName("窗口1");
        Thread t2 = new Thread(myRunnable);
        t2.setName("窗口2");
        Thread t3 = new Thread(myRunnable);
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
class MyRunnable2 implements Runnable{
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){
            boolean sale = sale();
            if (!sale){
                return;
            }
        }
    }

    public  synchronized boolean sale(){

        if (ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "=== " + (ticket--));
            return true;
        }else {
            return false;
        }


    }
}