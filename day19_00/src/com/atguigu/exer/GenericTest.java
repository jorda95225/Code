package com.atguigu.exer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTest {

    @Test
    public void test(){
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",10);
        map.put("dsd",15);
        map.put("323",16);
        map.put("fdfd",44);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry);
        }
    }

    @Test
    public void test2(){
        Buy<String> buy = new Buy<String>() {

            @Override
            public void setT(String s) {

            }
        };
        buy.setT("aaa");
    }
}
