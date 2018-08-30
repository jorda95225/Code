package com.atguigu.java3;

public class Person implements Comparable<Person> {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
