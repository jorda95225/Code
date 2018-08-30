package com.atguigu.java3;

import org.junit.Test;

import java.util.function.Consumer;

public class LambdaTest {

    @Test
    public void test(){

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("aaa");
            }
        };
        runnable.run();

        System.out.println("--------------");

        runnable = () -> System.out.println("aaaa");
        runnable.run();
    }

    @Test
    public void tset2(){
        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        };
        System.out.println("-----------");
        c = (String s) ->{
            System.out.println(s);
        };
    }

}
