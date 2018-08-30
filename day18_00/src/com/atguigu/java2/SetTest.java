package com.atguigu.java2;

import com.atguigu.java.Person;
import org.junit.Test;

import java.util.*;

public class SetTest {

    @Test
    public void test(){
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");

        set.add("ddd");
        set.add("ddd");
        set.add("ddd");
        set.add("ddd");

        set.add(new Person("aa",18));
        set.add(new Person("aa",18));
        System.out.println(set);
    }

    @Test
    public void test2(){
        HashSet hashSet = new HashSet();
        Person p = new Person("aa",18);
        System.out.println(p.hashCode());
        hashSet.add(p);

        Person p2 = new Person("aa",18);
        System.out.println(p2.hashCode());
        hashSet.add(p2);

        Person p3 = new Person("cc",18);
        System.out.println(p3.hashCode());
        hashSet.add(p3);

        System.out.println(hashSet);
    }

    @Test
    public void test3(){

        LinkedHashSet set = new LinkedHashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);
    }

    @Test
    public void test4(){

        TreeSet set = new TreeSet();
        /*set.add("aaa");
        set.add("ggg");
        set.add("ccc");
        set.add("h");*/

        /*set.add(111);
        set.add(32);
        set.add(114);
        set.add(153);*/

        set.add(new Student("ccc",38));
        set.add(new Student("bbb",20));
        set.add(new Student("jjj",38));
        set.add(new Student("fff",15));

        System.out.println(set);
    }

    @Test
    public void test5(){
        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");

        Iterator iterable = c.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }

        String[] names = {"aaa","vbv","ds"};
        for (String str:names) {
            System.out.println(str);
        }
    }


}
