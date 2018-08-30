package com.atguigu.java2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
//        MyRunnable runnable = new MyRunnable();
//        Thread t = new Thread(runnable);
//        t.setName("aaa");
//        Thread t1 = new Thread(runnable);
//        t1.setName("bbb");
//        Thread t2 = new Thread(runnable);
//        t2.setName("ccc");
//
//        t.start();
//        t1.start();
//        t2.start();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(System.out::println);

    }
}

class MyRunnable implements Runnable{

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {

        while (true){
            lock.lock();
           try {
               if (ticket > 0) {
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName() + "=== " + ticket--);
               } else {
                   return;
               }
           }finally {

               lock.unlock();
           }
        }
    }

}