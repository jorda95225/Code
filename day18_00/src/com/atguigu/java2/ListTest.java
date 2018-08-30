package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListTest {

    @Test
    public void test(){
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");

        List list2 = new ArrayList();
        list2.add(111);
        list2.add(222);
        list2.add(333);

        //list.addAll(1,list2);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.indexOf("ccc"));
        System.out.println(list.lastIndexOf("ccc"));
        System.out.println(list.remove(0));


    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("aa");
        list.add(111);
        list.add(1);
//        Object remove = list.remove(1);
        list.remove(new Integer(1));
        System.out.println(list);


    }
}
