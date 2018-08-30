package com.atguigu.java;

public class ThreadTest2 {

    public static void main(String[] args) {
        MyTicket ticket1 = new MyTicket();
        ticket1.setName("窗口1");
        MyTicket ticket2 = new MyTicket();
        ticket2.setName("窗口2");
        MyTicket ticket3 = new MyTicket();
        ticket3.setName("窗口3");

        ticket1.start();
        ticket2.start();
        ticket3.start();
    }


}

class MyTicket extends Thread{

    private  static int ticket = 100;
    private  static Object obj = new Object();
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
