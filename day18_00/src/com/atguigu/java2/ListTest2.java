package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest2 {
    @Test
    public void test(){
        LinkedList list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

//        list.addFirst("adjfd");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

    }
}
