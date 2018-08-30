package com.atguigu.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        System.out.println(list);
    }

    @Test
    public void test2(){
        Animal<String> animal = new Animal<>();
        animal.setK("aaa");
        System.out.println(animal.getK());

        Animal<Integer> animal2 = new Animal<>();
        animal2.setK(10);
        System.out.println(animal2.getK());

        Animal2<Integer,String,Double> animal3 = new Animal2<>();
        animal3.setK(10);
        animal3.setT("bb");
        animal3.setV(19.0);
    }

    @Test
    public void test3(){
//
//        Women women = new Women();
//        women.setT("aa");
//        String str = women.getT();
        Women<String> women = new Women();
        women.setT("aaaa");
    }

    @Test
    public void test4(){
        Buy<String > buy = new Buy<String>() {
            @Override
            public void setT(String s) {

            }
        };
    }
}
class A implements Buy<String>{

    @Override
    public void setT(String s) {

    }
}
