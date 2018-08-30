package com.atguigu.java5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod2 {

    @Test
    public void test(){
        List<String > list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list = list2;

        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
//        list3 = list4;

        set(list3);
//        set(list);
        set2(list4);

    }

    @Test
    public void tset2(){
        List<Number> list = new ArrayList<>();
        list.add(111);
        list.add(19.973);
        set2(list);

        ArrayList<Number> number = new ArrayList<>();
        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList<Object> object = new ArrayList<>();

        set3(number);
        set3(integer);
//        set3(object);

        set4(number);
//        set4(integer);
        set4(object);
    }


    public void set3(List<? extends Number> list){

    }

    public void set4(List<? super Number> list){

    }

    public void set2(List<?> list){
        list.add(null);
        for (Object obj:list) {

            System.out.println(obj);
        }

    }
    public void set(List<Number> list){

    }
}
