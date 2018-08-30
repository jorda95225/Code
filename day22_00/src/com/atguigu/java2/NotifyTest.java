package com.atguigu.java2;

public class NotifyTest {
    public static void main(String[] args) {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t1 = new Thread(myRunnable2);
        t1.setName("aaa");
        Thread t2 = new Thread(myRunnable2);
        t2.setName("bbb");

        t1.start();
        t2.start();
    }
}
class MyRunnable2 implements Runnable{

    private int ticket = 100;
    @Override
    public void run() {

        while(true){

            synchronized (this){
                this.notify();
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "==  " + ticket--);
                    try {
                        this.wait();
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