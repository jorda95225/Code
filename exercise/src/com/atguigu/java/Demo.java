package com.atguigu.java;

import org.junit.Test;

import java.io.Reader;
import java.util.SortedMap;
import java.util.SortedSet;

public class Demo {
    @Test
    public void test() throws ClassNotFoundException {

        Class clazz = String.class;
//        Person p = new Person();
//        Class class1 = p.getClass();
        Class class1 = new String().getClass();
        Class class2 = Class.forName("java.lang.String");
        System.out.println(clazz);
        System.out.println(class1);
        System.out.println(class2);

        Class class4 = getClass().getClassLoader().loadClass("java.lang.String");
        System.out.println(class4);

    }

    @Test
    public void test2(){

        System.out.println(new Person().s);


    }

}

class Person{

    String s;

}


