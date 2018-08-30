package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test(){
        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("vcc");
        c.add("hds");

        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){

    }
}
