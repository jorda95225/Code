package com.atguigu.exr;

public class ThreadTest2 {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.setName("aaa");
        MyThread thread2 = new MyThread();
        thread2.setName("aaa");
        MyThread thread3 = new MyThread();
        thread3.setName("aaa");
        thread.start();
        thread2.start();
        thread3.start();

    }
}
class MyThread extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "== " + ticket--);
                }else{
                    return;
                }
            }
        }
    }
}
