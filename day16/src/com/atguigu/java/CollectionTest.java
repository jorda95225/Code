package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    @Test
    public void test(){
        Collection c = new ArrayList();
        c.add("aaa");
        c.add(10);
        System.out.println(c);
        System.out.println(c.size());

        Collection c2 = new ArrayList();
        c2.add("bbb");
        c2.add((15));
        c.addAll(c2);
        System.out.println(c);
    }

    @Test
    public void test2(){
        Collection c = new ArrayList();
        c.add("aaa");
        c.add(10);
//        c.clear();
        System.out.println(c);

        boolean contains = c.contains(10);
        c.add(new Person(18,"aaa"));
        contains = c.contains(new Person(18,"aaa"));
        System.out.println(contains);

    }

    @Test
    public void test3(){
        Collection c = new ArrayList();

    }

}
