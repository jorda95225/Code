package com.atguigu.java3;

import org.junit.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("aa",18);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String,Integer> entry:entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(16);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        };

    }
}
