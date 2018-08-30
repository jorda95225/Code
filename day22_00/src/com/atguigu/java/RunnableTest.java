package com.atguigu.java;

public class RunnableTest {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
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

class MyRunnable implements Runnable{

    private int ticket = 100;
    private Object obj = new Object();
    @Override
    public void run() {

        while(true){
            synchronized (obj){
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=== " + (ticket--));
                }else {
                    return;
                }
            }
        }
    }
}
