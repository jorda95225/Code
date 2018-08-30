package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class StringTest {
    @Test
    public void test(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        System.out.println(sb.reverse());
    }

    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.getTime());

        java.sql.Date date1 = new java.sql.Date(new Date().getTime());
        System.out.println(date1);
    }

    @Test
    public void test3(){
        Collection<String> c = new ArrayList<>();
        c.add("aaa");
        c.add("vvv");
        c.add("ccc");
        c.add("ddd");

        for (String str:c) {
            System.out.println(str);
        }
        /*Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        
    }
}
