package com.atguigu.java;

public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + name + ")";
    }
}
