package com.atguigu.java;

import org.junit.Test;

public class ReflectionTest {

    @Test
    public void test() throws ClassNotFoundException {
        Class clazz = Person.class;

        Person person = new Person();
        Class class1 = person.getClass();

        Class class2 = Class.forName("com.atguigu.java.Person");

        System.out.println(clazz);
        System.out.println(class1);
        System.out.println(class2);
    }

}
