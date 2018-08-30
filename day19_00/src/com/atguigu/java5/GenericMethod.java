package com.atguigu.java5;

import com.atguigu.java.Person;
import org.junit.Test;

public class GenericMethod {
    @Test
    public void test(){
        Man<String> oldman = new Man<>();
        oldman.setT("aaa");

        Integer setE = oldman.setE(10);
        String setE1 = oldman.setE("aaa");
        Person setE2 = oldman.setE(new Person("aa"));

    }
}
