package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ForeachTest {

    @Test
    public void test(){
        String[] names = {"aaa","bbb","ccc"};
        for(String str:names){
            System.out.println(str);
        }
    }

    @Test
    public void test2(){
        Collection<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("avd");
        for (String str:c){
            System.out.println(str);
        }
    }

    @Test
    public void test3(){
        String[] names = {"aaa","bbb","ccc"};
        for (String str:names){
            str = "aaa";
        }
        System.out.println(Arrays.toString(names));
    }
}
