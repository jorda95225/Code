package com.atguigu.exr;

public class ThreadTest3 {

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        t1.setName("窗口1");
        MyThread2 t2 = new MyThread2();
        t2.setName("窗口2");
        MyThread2 t3 = new MyThread2();
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}

class MyThread2 extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {

        while (true){
            boolean sale = sale();
            if (!sale){
                return;
            }
        }
    }

    public static synchronized boolean sale(){
        if (ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "== " + ticket--);
            return true;
        }else{
            return false;
        }
    }
}
