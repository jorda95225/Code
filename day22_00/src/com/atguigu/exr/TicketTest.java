package com.atguigu.exr;

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread.start();
        thread2.start();
    }
}

class Ticket implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();
                if (ticket > 0){
                    try {
                        wait();
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