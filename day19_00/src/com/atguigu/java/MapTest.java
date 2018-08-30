package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class MapTest {
    @Test
    public void test(){
        HashMap hashMap = new HashMap();
        hashMap.put("aa",18);
        hashMap.put("aa",20);
        System.out.println(hashMap);
    }

    @Test
    public void test2(){
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aaa",18);
        linkedHashMap.put("fgj",18);
        linkedHashMap.put("afdsf",18);
        linkedHashMap.put("hgge",18);
        linkedHashMap.put("sds",18);
        System.out.println(linkedHashMap);
    }

    @Test
    public void test3(){
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return p1.name.compareTo(p2.name);
                }
                return 0;
            }

        });
        treeMap.put(new Person("aa"),18);
        treeMap.put(new Person("vv"),18);
        treeMap.put(new Person("ss"),18);
        treeMap.put(new Person("aa"),18);
        treeMap.put(new Person("dd"),18);

        System.out.println(treeMap);
    }

    @Test
    public void test4(){
        HashMap hashMap = new HashMap();
        hashMap.put(null,null);
        System.out.println(hashMap);

//        Hashtable hashtable = new Hashtable();
//        hashtable.put(null,null);
//        System.out.println(hashtable);
    }
    
    @Test
    public void test5() throws Exception {
        Properties properties = new Properties();
        File file = new File("person.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username + " " + password);
        fileInputStream.close();
    }
}
