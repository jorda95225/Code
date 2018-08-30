package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {

    @Test
    public void test(){
        Collection<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("ccc");
        c.add("bbb");

        Collection<String> c2 = new ArrayList<String>();
        c2.add("aaa");
        c2.add("ccc");
        c2.add("fdf");

        c.removeAll(c2);
        System.out.println(c);
    }

    @Test
    public void test2(){
        Collection c = new ArrayList();
        c.add("aaa");
        c.add(10);
        c.add("bbb");

        Collection c2 = new ArrayList();
        c2.add("aaa");
        c2.add("ccc");
        c2.add(10);

        c.retainAll(c2);
        System.out.println(c);
    }

    @Test
    public void test3(){

        Collection c = new ArrayList();
        c.add("aaa");
        c.add(10);
        c.add("bbb");
        Object[] obj = c.toArray();
        System.out.println(obj.length);


    }
}
