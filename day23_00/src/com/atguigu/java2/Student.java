package com.atguigu.java2;

public class Student extends Person<String> {
    private int age;
    private String name;

    public Student(){

    }

    private void info(int a ){
        System.out.println(a);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
